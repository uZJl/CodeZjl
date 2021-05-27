import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by JiaLe on 2021/5/27 19:49
 * ABA问题
 */
public class ABA {
    private static AtomicReference money = new AtomicReference(100);

    public static void main(String[] args) {
        //线程1 (-100)
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean result = money.compareAndSet(100,0);
                System.out.println(result);
            }
        });
        t1.start();

        //线程2 (-100)
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                boolean result = money.compareAndSet(100,0);
                System.out.println(result);
            }
        });
        t2.start();
    }
}
