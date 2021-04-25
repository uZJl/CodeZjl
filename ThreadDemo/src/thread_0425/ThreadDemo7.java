package thread_0425;

import com.sun.deploy.net.proxy.ProxyUnavailableException;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by JiaLe on 2021/4/25 19:54
 * 创建并得到线程的执行结果
 * 实现Callable接口 + Future 的方式
 */

public class ThreadDemo7 {
    static class MyCallable implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            int num = new Random().nextInt(10);
            System.out.println(Thread.currentThread().getName() + " " + num);
            return num;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //MyCallable
        MyCallable callable = new MyCallable();
        //FutureTask
        FutureTask<Integer> futureTask = new FutureTask<>(callable);

        Thread thread = new Thread(futureTask);

        thread.start();

        int result = futureTask.get();

        System.out.println(Thread.currentThread().getName() + " " + result);
    }
}
