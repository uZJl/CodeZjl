import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by JiaLe on 2021/5/23 9:24
 */
public class threadPool {
    public static void main(String[] args) {
        //任务队列要设置容量
        ThreadPoolExecutor executor =
                new ThreadPoolExecutor(5, 10, 60,
                        TimeUnit.SECONDS, new LinkedBlockingQueue<>(1000));
        //线程池创建线程是懒加载：在有任务的时候才会
        for (int i = 0; i < 5; i++) {
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("线程名" + Thread.currentThread().getName());
                }
            });
        }

    }
}
