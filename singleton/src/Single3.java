/**
 * Created by JiaLe on 2021/6/24 20:17
 */
public class Single3 {
    static class BlockingQueue {
        //使用基于数组的方式
        private int[] array = new int[1000];
        private int head = 0;
        private int tail = 0;
        //head 和 tail 构成的是一个前闭后开的区间
        //当两者重合时，可能是队列空，也可能是队列满
        //为了区分，额外引入一个size来表示
        private int size = 0;

        //入队列操作
        public void put(int value) throws InterruptedException {
            synchronized (this) {
                while (size == array.length) {
                    this.wait();
                }
                //把value放到队尾
                array[tail] = value;
                tail++;
                if (tail == array.length) {
                    tail = 0;
                }
                size++;

                this.notify();
            }
        }

        //出队列操作
        public int take() throws InterruptedException {
            int ret = -1;
            synchronized (this) {
                while (size == 0) {
                    this.wait();
                }
                ret = array[head];
                head++;
                if (head == array.length) {
                    head = 0;
                }
                size--;

                this.notify();
            }
            return ret;
        }
    }
}
