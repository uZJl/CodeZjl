/**
 * Created by JiaLe on 2021/5/23 16:37
 */
public class ThreadLocalDemo7 {
    //修改为可继承的
    static ThreadLocal<String> threadLocal = new InheritableThreadLocal<>();

    public static void main(String[] args) {
        threadLocal.set("java");

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                String res = threadLocal.get();
                System.out.println(res);
            }
        });
        t1.start();
    }
}
