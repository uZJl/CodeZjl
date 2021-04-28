package thread_0425;

/**
 * Created by JiaLe on 2021/4/27 19:06
 */
public class ThreadDemo12 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        },"张三");
        thread.start();//张三
        thread.run();//main
        //start 和 run 之间的区别：
        //run 属于普通方法
        //start属于启动线程的方法
        //run 可以执行多次
        //start 只能执行一次
    }
}
