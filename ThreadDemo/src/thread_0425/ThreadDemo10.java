package thread_0425;

import java.util.Random;

/**
 * Created by JiaLe on 2021/4/25 20:57
 */
public class ThreadDemo10 {
    public static void main(String[] args) {
        //定义任务
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "开始起跑了");
                try {
                    int num = 1 + new Random().nextInt(5);
                    Thread.sleep(num * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "到终点了");
            }
        };
        ThreadGroup group = new ThreadGroup("百米赛跑一组");
        Thread t1 = new Thread(group,runnable,"张三");
        Thread t2 = new Thread(group,runnable,"李四");
        t1.start();
        t2.start();
        //等待所有选手到达终点
        while(group.activeCount() != 0) {

        }
        System.out.println("宣布成绩");
    }
}
