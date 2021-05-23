import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by JiaLe on 2021/5/23 11:12
 */
public class shutThreadPoolMore {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5,5,0,
                TimeUnit.SECONDS, new LinkedBlockingQueue<>(1000));
    }
}
