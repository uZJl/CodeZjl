import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/6/7 21:05
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = i + 1;
            }
            HashMap<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                map.put(arr[i],i);
            }
            for (int i = 0; i < n; i++) {
                int other = m - arr[i];
                if (map.containsKey(other) && map.get(other) != i) {

                }
            }
        }
    }
}
