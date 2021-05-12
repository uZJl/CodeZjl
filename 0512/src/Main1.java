import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/12 20:35
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            helper(str);
        }
        scanner.close();
    }
    public static void helper(String str) {
        char[] arr = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) {
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println(-1);
    }
}
