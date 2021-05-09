package thread_0425;

/**
 * Created by JiaLe on 2021/5/9 11:09
 */
public class ThreadTongxin {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("xiancheng1 jinruxianchengdfangfa");
                //wait是对象的方法
                //sleep是线程的方法
                synchronized (lock) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("xiancheng1 zhixingwancheng");
            }
        },"t1");

        t1.start();

        Thread.sleep(1000);
        System.out.println("huanxingxiancheng1");
        //唤醒锁也需要加锁
        synchronized (lock) {
            lock.notify();
        }
    }
}
