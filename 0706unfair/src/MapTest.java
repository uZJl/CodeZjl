import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;

/**
 * Created by JiaLe on 2021/7/6 22:12
 */
public class MapTest {
    public static void main(String[] args) {
        /**
         * 1.
         */
        HashMap<String, String> map = Collections.synchronizedMap(new HashMap<>());
//        HashMap<String, String> map = new HashMap<>();
        //加载因子 初始化容量

        for (int i = 1; i <= 30; i++) {
            new Thread(()->{
                map.put(Thread.currentThread().getName(), UUID.randomUUID().toString().substring(0,5));
                System.out.println(map);
            },String.valueOf(i)).start();
        }
    }
}
