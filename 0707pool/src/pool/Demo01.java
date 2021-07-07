package pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by JiaLe on 2021/7/7 21:32
 */
public class Demo01 {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        ExecutorService threadPool2 = Executors.newFixedThreadPool(5);
        ExecutorService threadPool3 = Executors.newCachedThreadPool();
        try {
            for (int i = 0; i < 10; i++) {
                threadPool.execute(()->{
                    System.out.println(Thread.currentThread().getName() + "ok");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }

    }
}
