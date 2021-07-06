import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by JiaLe on 2021/7/6 21:29
 */
//java.util.ConcurrentModificationException
public class ListTest {
    public static void main(String[] args) {
        /**
         * 解决方案：
         * 1.Vector默认安全(使用的synchronized)
         * List<String> list = new Vector<>();
         * 2.List<String> list = Collections.synchronizedList(new ArrayList<>());
         * 3.List<String> list = new CopyOnWriteArrayList<>();
         * CopyOnWrite 写入时复制 COW 计算机程序设计领域的一种优化策略
         * 多个线程调用的时候 list 读取的时候读取到的是一个固定的，
         * 写入的时候可能会产生数据覆盖问题
         */

        /**
         * CopyOnWriteArrayList使用的是lock锁，Vector使用的synchronized效率太低
         * public synchronized void setSize(int newSize) {
         *         modCount++;
         *         if (newSize > elementCount) {
         *             ensureCapacityHelper(newSize);
         *         } else {
         *             for (int i = newSize ; i < elementCount ; i++) {
         *                 elementData[i] = null;
         *             }
         *         }
         *         elementCount = newSize;
         *     }
         *
         *  public boolean add(E e) {
         *         final ReentrantLock lock = this.lock;
         *         lock.lock();
         *         try {
         *             Object[] elements = getArray();
         *             int len = elements.length;
         *             Object[] newElements = Arrays.copyOf(elements, len + 1);
         *             newElements[len] = e;
         *             setArray(newElements);
         *             return true;
         *         } finally {
         *             lock.unlock();
         *         }
         *     }
         */
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            new Thread(()->{
                list.add(UUID.randomUUID().toString().substring(0,5));
                System.out.println(list);
            },String.valueOf(i)).start();
        }
    }
}
