package thread_0425;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by JiaLe on 2021/4/25 20:25
 */
public class ThreadDemo8 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("开始时间：" + new Date());
        //休眠方式1 休眠1s
        //Thread.sleep(1000);
        //休眠方式2
        //TimeUnit.SECONDS.sleep(1);
        //休眠方式3
        Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        System.out.println("结束时间：" + new Date());
    }
}
