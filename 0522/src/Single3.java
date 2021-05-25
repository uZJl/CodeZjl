/**
 * Created by JiaLe on 2021/5/25 20:29
 */
public class Single3 {
    //懒汉方式——>性能不佳
    static class Singleton {
        //1.先创建一个私有的构造函数(防止其它地方直接实例化)
        private Singleton() {

        }
        //2.创建一个私有的类对象
        private static Singleton singleton = null;

        //3.提供统一的访问方法
        public static synchronized Singleton getInstance() {
            if (singleton == null) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //第一次访问
                singleton = new Singleton();
            }
            return singleton;
        }
    }
    private static Singleton s1 = null;
    private static Singleton s2 = null;
    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                s1 = Singleton.getInstance();
            }
        });
        


        System.out.println(s1 == s2);
    }
}
