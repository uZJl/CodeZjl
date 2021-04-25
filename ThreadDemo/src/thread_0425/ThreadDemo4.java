package thread_0425;

/**
 * Created by JiaLe on 2021/4/25 19:43
 */
public class ThreadDemo4 {
    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("线程名称：" + Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
        //新建一个MyRunnable类
        MyRunnable runnable = new MyRunnable();
        //新建一个Thread
        Thread thread = new Thread(runnable);
        //启动thread
        thread.start();
    }
}
