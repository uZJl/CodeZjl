/**
 * Created by JiaLe on 2021/5/23 12:05
 */
public class ThreadLocalDemo {
    //创建
    static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //set ThreadLocal
                String tname = Thread.currentThread().getName();
                threadLocal.set(tname);
                System.out.println(String.format(tname,tname));
                printTName();
            }
        },"线程1");
        t1.start();



  Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                //set ThreadLocal
                String tname = Thread.currentThread().getName();
                threadLocal.set(tname);
                System.out.println(String.format(tname,tname));
                printTName();
            }
        },"线程2");
        t2.start();

    }
    private static void printTName() {
        String tname = Thread.currentThread().getName();
        String result = threadLocal.get();
        System.out.println(result);
    }
}
