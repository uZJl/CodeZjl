import java.util.function.Supplier;

/**
 * Created by JiaLe on 2021/5/23 15:16
 */
public class ThreadLocalDemo2 {
    static ThreadLocal<String> threadLocal = ThreadLocal.withInitial(new Supplier<String>() {
        @Override
        public String get() {
            System.out.println("执行了初始化方法");
            return "java";
        }
    });

    public static void main(String[] args) {
        String res = threadLocal.get();
        System.out.println("result:" + res);
    }
}
