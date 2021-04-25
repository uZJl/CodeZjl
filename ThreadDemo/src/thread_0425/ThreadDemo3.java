package thread_0425;

/**
 * Created by JiaLe on 2021/4/25 19:39
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("线程名称：" + Thread.currentThread().getName());
            }
        };
        thread.start();
    }
}

