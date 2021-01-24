/**
 * Created by JiaLe on 2021/1/24 19:28
 */
import java.util.*;
public class Joseph {
    public int getResult(int n) {
        // write code here
        LinkedList<Integer> list = new LinkedList<Integer>();
        for(int i = 1;i <= n;i++) {
            list.add(i);
        }
        int tmp = 2;
        while(list.size() > 1) {
            for(int i = 0;i < list.size();i++) {
                if((i+1) % tmp != 1) {
                    list.set(i,-1);
                }
            }
            tmp++;
            for(int i = 0;i < list.size();i++) {
                if(list.get(i) == -1) {
                    list.remove(i--);
                }
            }
            list.addFirst(list.get(list.size() - 1));
            list.remove(list.size()-1);
        }
        return list.getFirst();
    }
}
