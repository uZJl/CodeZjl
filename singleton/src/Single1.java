/**
 * Created by JiaLe on 2021/6/24 19:26
 */
public class Single1 {
    //懒汉模式
    static class Singleton {
        private Singleton() {}
        private static Singleton instance = null;
        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }


}
