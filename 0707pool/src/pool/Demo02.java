package pool;

import java.util.concurrent.*;

/**
 * Created by JiaLe on 2021/7/7 21:52
 */
public class Demo02 {
    public static void main(String[] args) {
        ExecutorService threadPool = new ThreadPoolExecutor(
                2,
                5,
                3,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardOldestPolicy()
        );
        try {
            //无异常，两个线程执行
//            for (int i = 1; i <= 5; i++) {
            //无异常，触发一个最大核心线程数，三个线程
//            for (int i = 1; i <= 6; i++) {
            //无异常，最大承载线程数=阻塞队列容量+最大核心线程数=3+5
//            for (int i = 1; i <= 8; i++) {
            // 有异常，并发线程数量超过最大负载，触发拒绝策略
            // java.util.concurrent.RejectedExecutionException
            for (int i = 1; i <= 9; i++) {
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
