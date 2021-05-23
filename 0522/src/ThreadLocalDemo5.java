import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 * Created by JiaLe on 2021/5/23 15:30
 */
public class ThreadLocalDemo5 {
    static ThreadLocal<SimpleDateFormat> threadLocal =
            //ThreadLocal.withInitial(() -> new SimpleDateFormat("mm:ss"));
            ThreadLocal.withInitial(new Supplier<SimpleDateFormat>() {
                @Override
                public SimpleDateFormat get() {
                    System.out.println("执行初始化");
                    return new SimpleDateFormat("mm:ss");
                }
            });

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                10,10,0, TimeUnit.SECONDS,new LinkedBlockingQueue<>(1000));
        for (int i = 1; i < 1001; i++) {
            int finalI = i;
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    Date date = new Date(finalI * 1000);
                    myFormat(date);
                }
            });
        }
    }
    public static void myFormat(Date date) {
        String res = threadLocal.get().format(date);
        System.out.println("时间：" + res);
    }
}
