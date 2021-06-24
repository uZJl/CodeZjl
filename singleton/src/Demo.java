import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created by JiaLe on 2021/6/24 21:46
 */
public class Demo {
    //优先队列中的元素必须是可比较的
    static class Task implements Comparable<Task>{
        private Runnable command;
        private long time;

        public Task(Runnable command, long after) {
            this.command = command;
            this.time = System.currentTimeMillis() + after;
        }

        public void run() {
            command.run();
        }

        @Override
        public int compareTo(Task o) {
            //谁的时间小先执行
            return (int)(this.time - o.time);
        }
    }

    static class Worker extends Thread {
        private PriorityBlockingQueue<Task> queue = new PriorityBlockingQueue<>();
        public Worker(PriorityBlockingQueue<Task> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
            //实现具体的线程执行的内容
            while (true) {

                try {
                    //1.取出对头元素，检查时间是否到了
                    Task task = queue.take();
                    //2.检查当前任务时间是否到了
                    long curTime = System.currentTimeMillis();
                    if (task.time > curTime) {
                        // 时间还没到，就把任务塞回队列中
                        queue.put(task);
                    } else {
                        task.run();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        }
    }

    static class Timer {
        private PriorityBlockingQueue<Task> queue = new PriorityBlockingQueue<>();

        public Timer() {
            Worker worker = new Worker(queue);
            worker.start();
        }

        public void schedule (Runnable command, long after) {
            Task task = new Task(command, after);
            queue.put(task);
        }
    }

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("hehe");
                timer.schedule(this, 2000);
            }
        }, 2000);
    }
}
