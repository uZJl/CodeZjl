package thread_0425;

/**
 * Created by JiaLe on 2021/5/9 11:46
 */
public class WaitOrSleep {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("xiancheng1 youngyoulesuo jinruxiumianzhuangtai");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"t1");
        t1.start();

        Thread.sleep(1000);
        //主线程试图获取锁‘
        synchronized (lock) {
            System.out.println("zhuxianchenghhuoqudaolesuo lock");
        }
    }
}
