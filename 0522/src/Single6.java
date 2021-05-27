import java.util.Random;

/**
 * Created by JiaLe on 2021/5/25 21:02
 */
public class Single6 {
    static class MyBlockingQueue{
        private int[] values;//实际存储数据的数组
        private int first;//队首下标
        private int last;//队尾下标
        private int size;//队列元素的实际大小

        public MyBlockingQueue(int initial) {
            //初始化变量
            values = new int[initial];
            first = 0;
            last = 0;
            size = 0;
        }
        //添加元素（添加到队尾）
        public void offer(int value) {
            synchronized (this) {
                //判断实际大小是否存满(边界值)
                if (size == values.length) {
                    //队列已满
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //添加元素到队尾
                values[last++] = value;
                size++;
                //循环队列：判断是否为最后一个元素
                if (last == values.length) {
                    last = 0;
                }
                //尝试唤醒消费者
                this.notify();
            }
        }

        //查询方法
        public int poll() {
            int result = -1;
            synchronized (this) {
                if (values.length == 0) {
                    //队列为空阻塞等待
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //取元素
                result = values[first++];
                size--;
                //判断是否为最后一个元素
                if (first == values.length) {
                    first = 0;
                }
                //尝试唤醒生产者
                this.notify();
            }
            return result;
        }
    }

    public static void main(String[] args) {
        MyBlockingQueue myBlockingQueue = new MyBlockingQueue(100);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //每隔500ms生产一条数据
                while (true) {
                    int num = new Random().nextInt(100);
                    System.out.println(num);
                    myBlockingQueue.offer(num);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    int result = myBlockingQueue.poll();
                    System.out.println(result);
                }
            }
        });
        t2.start();
    }
}
