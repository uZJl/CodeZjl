package thread_0425;

/**
 * Created by JiaLe on 2021/4/25 20:33
 */
public class ThreadDemo9 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println();
            }
        });
    }
}
