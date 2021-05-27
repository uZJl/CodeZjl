import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * Created by JiaLe on 2021/5/27 19:49
 * ABA问题
 */
public class ABA2 {
    private static AtomicStampedReference money = new AtomicStampedReference(
            100,1);
    //private static AtomicReference money = new AtomicReference(100);

    public static void main(String[] args) throws InterruptedException {
        //线程1 (-100)
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean result = money.compareAndSet(100,0,
                        1,2);
                System.out.println(result);
            }
        });
        t1.start();

        //转入100元
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                //+100
                boolean result = money.compareAndSet(0,100,
                        2,3);
                System.out.println(result);
            }
        });
        t1.join();
        t3.start();
        //线程2 (-100)
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean result = money.compareAndSet(100,0,
                        1,2);
                System.out.println(result);
            }
        });
        t3.join();
        t2.start();
    }
}
