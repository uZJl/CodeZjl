/**
 * Created by JiaLe on 2021/5/25 20:29
 */
public class Single1 {
    //懒汉方式
    static class Singleton {
        //1.先创建一个私有的构造函数(防止其它地方直接实例化)
        private Singleton() {

        }
        //2.创建一个私有的类对象
        private static Singleton singleton = null;

        //3.提供统一的访问方法
        public static Singleton getInstance() {
            if (singleton == null) {
                //第一次访问
                singleton = new Singleton();
            }
            return singleton;
        }
    }

    public static void main(String[] args) {
        //创建第一个对象
        Singleton s1 = Singleton.getInstance();
        //创建第二个对象
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);
    }
}
