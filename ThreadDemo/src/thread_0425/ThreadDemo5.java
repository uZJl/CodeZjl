package thread_0425;

/**
 * Created by JiaLe on 2021/4/25 19:47
 */
public class ThreadDemo5 {
    public static void main(String[] args) {
        //匿名内部类实现线程
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程名称：" + Thread.currentThread().getName());
            }
        });
        thread.start();;
    }
}
