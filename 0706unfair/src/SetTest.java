import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Created by JiaLe on 2021/7/6 21:51
 */

//java.util.ConcurrentModificationException
//并发修改异常
public class SetTest {
    public static void main(String[] args) {
        /**
         * 1. Set<String> set = Collections.synchronizedSet(new HashSet<>());
         * 2. Set<String> set = new CopyOnWriteArraySet<>();
         */
        /**
         * HashSet底层
         * public HashSet() {
         *         map = new HashMap<>();
         *     }
         *
         * add方法
         * public boolean add(E e) {
         *         return map.put(e, PRESENT)==null;
         *     }
         * set本质为map 因为map的key不可重复，所以set的元素也不可重复且无序
         */
        Set<String> set = new HashSet<>();
        for (int i = 1; i <= 30; i++) {
            new Thread(()->{
                set.add(UUID.randomUUID().toString().substring(0,5));
                System.out.println(set);
            },String.valueOf(i)).start();
        }
    }
}
