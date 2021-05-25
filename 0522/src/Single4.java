/**
 * Created by JiaLe on 2021/5/25 20:29
 */
public class Single4 {
    //懒汉方式——>性能不佳
    static class Singleton {
        //1.先创建一个私有的构造函数(防止其它地方直接实例化)
        private Singleton() {

        }
        //2.创建一个私有的类对象
        private static Singleton singleton = null;

        //3.提供统一的访问方法
        //双重校验锁
        public static Singleton getInstance() {
            if (singleton == null) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (Singleton.class) {
                    if (singleton == null)
                        //第一次访问
                        //非原子性
                        // 1.先在内存中开辟内存空间
                        // 2.初始化
                        // 3.将变量singleton指向内存区域
                        singleton = new Singleton();
                        //编译器优化(指令重排序) 1-2-3——>1-3-2
                }
            }
            return singleton;
        }
    }
    private static Singleton s1 = null;
    private static Singleton s2 = null;
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                s1 = Singleton.getInstance();
            }
        });
        t1.start();

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                s2 = Singleton.getInstance();
            }
        });
        t2.start();
        t1.join();
        t2.join();


        System.out.println(s1 == s2);
    }
}
