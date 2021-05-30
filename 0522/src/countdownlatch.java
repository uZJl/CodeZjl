import java.util.concurrent.CountDownLatch;

/**
 * Created by JiaLe on 2021/5/30 9:44
 */
public class countdownlatch {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(5);

        for (int i = 1; i < 6; i++) {
            int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() +
                            "开始起跑");
                    try {
                        Thread.sleep(1000 * finalI);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    latch.countDown();
                }
            }).start();
        }
        //阻塞等待
        latch.await();
        System.out.println("所有人都到达终点，宣布排名");
    }
}
