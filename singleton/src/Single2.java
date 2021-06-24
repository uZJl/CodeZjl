/**
 * Created by JiaLe on 2021/6/24 19:26
 */
public class Single2 {
    //懒汉模式
    static class Singleton {
        private Singleton() {}
        //volatile 避免内存可见性引出的问题
        private volatile static Singleton instance = null;
        public static Singleton getInstance() {
            //双重检验锁
            if (instance == null) {
                synchronized (Singleton.class) {
                    if (instance == null) {
                        instance = new Singleton();
                    }
                }
            }
            return instance;
        }
    }


}
