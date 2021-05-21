package thread_0425;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by JiaLe on 2021/5/21 17:24
 */
public class Out {
    static class MyOOMClass {
        private static byte[] bytes = new byte[1*1024*1024];
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        
    }
}
