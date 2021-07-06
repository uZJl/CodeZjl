package JUC;

/**
 * Created by JiaLe on 2021/7/6 20:11
 */
public class A {
    public static void main(String[] args) {
        Data data = new Data();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data.increment();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"A").start();
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                try {
                    data.decrement();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"B").start();
    }
}

// 判断等待 业务 通知
class Data {
    private int number = 0;

    public synchronized void increment() throws InterruptedException {
        while (number != 0) {
            //等待
            this.wait();
        }
        number++;
        System.out.println(Thread.currentThread().getName() + "=>" + number);
        //通知其他线程，+1完毕
        this.notifyAll();
    }
    public synchronized void decrement() throws InterruptedException {
        while (number == 0) {
            //等待
            this.wait();
        }
        number--;
        //通知其他线程，-1完毕
        System.out.println(Thread.currentThread().getName() + "=>" + number);
        this.notifyAll();
    }
}
