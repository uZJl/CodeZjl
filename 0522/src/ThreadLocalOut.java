/**
 * Created by JiaLe on 2021/5/25 18:55
 */
public class ThreadLocalOut {
    static class OOMobject {
        private byte[] bytes = new byte[1 *1024 * 1024];
    }

    static ThreadLocal<OOMobject> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            int finalI = i;
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    OOMobject ooMobject = new OOMobject();
                    System.out.println("任务" + finalI + "执行");
                    threadLocal.set(ooMobject);
                    ooMobject = null;
                }
            });
            t.start();
            Thread.sleep(200);
        }
    }
}
