package thread_0425;

/**
 * Created by JiaLe on 2021/4/25 19:35
 */
public class ThreadDemo2 {
    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("线程名称：" + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread t1 = new MyThread();
        //运行新线程
        t1.start();
        System.out.println("当前线程名称（主线程）：" + Thread.currentThread().getName());
    }
}
