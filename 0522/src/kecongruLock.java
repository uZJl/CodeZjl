/**
 * Created by JiaLe on 2021/5/27 21:06
 */
public class kecongruLock {
    private static Object lock= new Object();

    public static void main(String[] args) {
        //第一次进入锁
        synchronized (lock) {
            System.out.println("第一次进入锁");
            synchronized (lock) {
                System.out.println("第二次进入锁");
            }
        }
    }
}
