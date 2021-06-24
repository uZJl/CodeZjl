/**
 * Created by JiaLe on 2021/6/24 19:13
 */
public class Single {
    //饿汉模式
    //先创建一个表示单例的类
    static class Singleton {
        //创建一个无法在该类外部实例化的私有构造方法
        private Singleton(){};
        //创建一个static成员，表示Singleton的唯一实例
        private static Singleton instance = new Singleton();
        //获取实例的唯一方法
        public static Singleton getInstance() {
            return instance;
        }
    }

    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s == s2);

    }
}
