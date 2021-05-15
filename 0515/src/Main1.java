import java.util.*;

/**
 * Created by JiaLe on 2021/5/15 10:12
 */
public class Main1 {
    public int getValue(int[] gifts, int n) {
        // write code here
        int votes = 0;
        int x = 0;
        for(int num : gifts) {
            if(votes == 0) {
                x = num;
                votes++;
            } else if (num == x) {
                votes++;
            } else {
                votes--;
            }
        }
        int cnt = 0;
        for(int num : gifts) {
            if(num == x) {
                cnt++;
            }
        }
        return (cnt >= n/2) ? x : 0;
    }
}
