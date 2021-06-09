import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/6/9 22:34
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            char[] arrA = scanner.next().toCharArray();
            char[] arrB = scanner.next().toCharArray();
            HashMap<Character,Integer> mapA = new HashMap<>();
            HashMap<Character,Integer> mapB = new HashMap<>();
            for (char c : arrA) {
                mapA.put(c,mapA.getOrDefault(c,0) + 1);
            }
            for (char c : arrB) {
                mapB.put(c,mapB.getOrDefault(c,0) + 1);
            }
            boolean flag = true;
            for (int i = 0; i < arrB.length; i++) {
                if (mapA.containsKey(arrB[i]) && mapA.get(arrB[i]) >= mapB.get(arrB[i])) {
                    continue;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        scanner.close();
    }
}
