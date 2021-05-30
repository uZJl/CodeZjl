import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by JiaLe on 2021/5/30 9:22
 * 信号量实现停车场的示例
 */
public class semaphore {
    public static void main(String[] args) {
        //创建信号量
        Semaphore semaphore = new Semaphore(2);

        //创建一个线程池
        ThreadPoolExecutor executor = new ThreadPoolExecutor(10,10,
                0, TimeUnit.SECONDS,new LinkedBlockingQueue<>(100));
        for (int i = 0; i < 4; i++) {
            //创建任务一
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() +
                            "到达停车场");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //试图进入停车场
                    try {
                        //尝试获取锁
                        semaphore.acquire();
                        //代码执行到此处说明已经获取锁
                        System.out.println(Thread.currentThread().getName() +
                                "进入停车场");

                        //车辆停留的时间构建
                        int num = 1 + new Random().nextInt(5);
                        try {
                            Thread.sleep(num * 1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //离开停车场
                        System.out.println(Thread.currentThread().getName() +
                                "离开停车场");

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        //释放锁
                        semaphore.release();
                    }

                }
            });
        }

    }
}
