import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Created by JiaLe on 2021/7/7 9:49
 */
public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        for (int i = 1; i <= 6; i++) {
            new Thread(()->{
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + "acquire");
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println(Thread.currentThread().getName() + "release");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();

                }
            },String.valueOf(i)).start();
        }
    }
}
