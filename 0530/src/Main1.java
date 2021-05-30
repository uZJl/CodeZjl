import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/30 20:38
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.next();
            }
            Arrays.sort(arr);
            List<String> list = new ArrayList<>();
            for (int i = 1; i < n; i++) {
                if (!arr[i].startsWith(arr[i - 1] + "/")) {
                    list.add(arr[i - 1]);
                }
            }
            list.add(arr[n - 1]);
            for (String s : list) {
                System.out.println("mkdir -p " + s);
            }
            System.out.println();
        }
        scanner.close();
    }
}
