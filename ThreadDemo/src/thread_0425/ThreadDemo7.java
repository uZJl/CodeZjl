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
        //1.创建一个 Callable
        MyCallable callable = new MyCallable();
        //2.创建一个 FutureTask 对象来接收返回值
        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        //3.创建 Thread
        Thread thread = new Thread(futureTask);
        // 启动线程
        thread.start();
        // 得到线程执行结果
        int result = futureTask.get();

        System.out.println(Thread.currentThread().getName() + " " + result);
    }
}
