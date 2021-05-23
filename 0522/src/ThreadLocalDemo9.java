/**
 * Created by JiaLe on 2021/5/23 16:37
 */
public class ThreadLocalDemo9 {
    static ThreadLocal<String> threadLocal = new InheritableThreadLocal<>();

    public static void main(String[] args) throws InterruptedException {


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                threadLocal.set("java");
            }
        });
        t1.start();
        t1.join();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                String res = threadLocal.get();
                System.out.println(res);
            }
        });
        t2.start();
    }
}
