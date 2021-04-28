package thread_0425;

/**
 * Created by JiaLe on 2021/4/25 21:09
 */
public class ThreadDemo11 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {

        },"张三");
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        System.out.println(t1.getId());
        //新创建的优先级默认为5
        //最小的优先级为1
        //最大的优先级为10
        //优先级的值越大，优先级越高，可能被优先执行的概率越高
        System.out.println(t1.getPriority());
        System.out.println(t1.getName());
        System.out.println(t1.isAlive());
        /**
         * 线程分类
         *  用户线程
         *  main方法为用户线程
         *  守护线程
         *  守护线程是用来服务用户线程的
         *  当进程中没有用户线程运行，进程就会结束
         *  守护线程使用场景：Java垃圾回收器
         *                 TCP健康检测
         *   守护线程注意事项：
         *      守护线程属性的设置必须放在线程启动（start）之前，如果在之后，程序会报错（状态未找到），而且设置的属性不会生效
         *      在守护线程里创建的线程默认情况下都是守护线程
         */
        System.out.println(t1.isDaemon());
        System.out.println(t1.isInterrupted());


    }
}
