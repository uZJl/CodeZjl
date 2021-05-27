import java.util.Date;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by JiaLe on 2021/5/27 20:45
 */
public class duxieLock {

    public static void main(String[] args) {
        //创建一个读写锁 true / false 表示是否公平锁 true公平
        ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        //读锁
        ReentrantReadWriteLock.ReadLock readLock = readWriteLock.readLock();
        //写锁
        ReentrantReadWriteLock.WriteLock writeLock = readWriteLock.writeLock();

        //声明线程池
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                10,10,0,
                TimeUnit.SECONDS,new LinkedBlockingQueue<>(1000));

        //1 读锁
        executor.execute(new Runnable() {
            @Override
            public void run() {
                //加锁
                readLock.lock();
                try {
                    //业务逻辑处理
                    System.out.println(Thread.currentThread().getName() + "执行读锁" + new Date());
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    readLock.unlock();
                }
            }
        });
        //2 读锁
        executor.execute(new Runnable() {
            @Override
            public void run() {
                //加锁
                readLock.lock();
                try {
                    //业务逻辑处理
                    System.out.println(Thread.currentThread().getName() + "执行读锁" + new Date());
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    readLock.unlock();
                }
            }
        });
        //3
        executor.execute(new Runnable() {
            @Override
            public void run() {
                writeLock.lock();
                try {
                    System.out.println(Thread.currentThread().getName() + "执行写锁" + new Date());
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    writeLock.unlock();
                }
            }
        });
        //4
        executor.execute(new Runnable() {
            @Override
            public void run() {
                writeLock.lock();
                try {
                    System.out.println(Thread.currentThread().getName() + "执行写锁" + new Date());
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    writeLock.unlock();
                }
            }
        });
    }
}
