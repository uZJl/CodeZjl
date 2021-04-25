package thread_0425;

/**
 * Created by JiaLe on 2021/4/25 19:49
 */
public class ThreadDemo6 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("线程名称：" + Thread.currentThread().getName());
        });
        thread.start();
    }
}
