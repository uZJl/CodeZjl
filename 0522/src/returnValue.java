import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by JiaLe on 2021/5/23 10:58
 */
public class returnValue {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                5, 5 ,0 , TimeUnit.SECONDS, new LinkedBlockingQueue<>(1000)
        );
        
        Future<Integer> future = executor.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int num = new Random().nextInt(10);
                System.out.println(num);
                return num;
            }
        });
        System.out.println(future.get());

    }
}
