package thread_0425;

/**
 * Created by JiaLe on 2021/5/9 10:42
 */


public class DeadLock1 {
    public static void main(String[] args) {
        Object lockA = new Object();
        Object lockB = new Object();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockA) {
                    System.out.println("xiancheng1dedaoleLockA");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("xiancheng1dengdaihuoquLockB");
                    //尝试获取锁B
                    synchronized (lockB) {
                        System.out.println("xianchegn1dedaoLockB");
                    }
                }
            }
        },"t1");
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lockB) {
                    System.out.println("xiancheng2dedaoleLockB");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("xiancheng2dengdaihuoquLockA");
                    //尝试获取锁B
                    synchronized (lockA) {
                        System.out.println("xianchegn2dedaoLockA");
                    }
                }
            }
        },"t2");
        t2.start();
    }
}

