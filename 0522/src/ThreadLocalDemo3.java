import java.util.function.Supplier;

/**
 * Created by JiaLe on 2021/5/23 15:16
 */
public class ThreadLocalDemo3 {
    static ThreadLocal<String> threadLocal = ThreadLocal.withInitial(() ->"java");

    public static void main(String[] args) {
        try {
            String res = threadLocal.get();
            System.out.println("result:" + res);
        } finally {
            threadLocal.remove();
        }
        String res2 = threadLocal.get();
        System.out.println("result2:" + res2);

    }
}
