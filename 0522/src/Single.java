/**
 * Created by JiaLe on 2021/5/25 20:11
 */
public class Single {
    //饿汉方式
    static class Singleton {
        //1.先创建一个私有的构造函数(防止其它类创建)
        private Singleton() {
        }
        //2.定义私有变量(不用加锁也是线程安全的)
        private static Singleton singleton = new Singleton();
        //3.提供公共的获取实例的方法
        public static Singleton getInstance() {
            return singleton;
        }
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}
