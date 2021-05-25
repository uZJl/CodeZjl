import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by JiaLe on 2021/5/25 18:55
 */
public class ThreadLocalOut1 {
    static class OOMobject {
        private byte[] bytes = new byte[1 *1024 * 1024];
    }

    static ThreadLocal<OOMobject> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) throws InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(10,10,0, TimeUnit.SECONDS,new LinkedBlockingQueue<>(1000));

        for (int i = 0; i < 5; i++) {
            int finalI = i;
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    OOMobject ooMobject = new OOMobject();
                    System.out.println("任务" + finalI + "执行");
                    threadLocal.set(ooMobject);
                    ooMobject = null;
                }
            });
            Thread.sleep(200);
        }
    }
}
