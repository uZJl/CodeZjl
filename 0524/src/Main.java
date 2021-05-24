import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/24 11:05
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            StringBuilder sb = new StringBuilder(n + " =");
            for (int i = 2; i <= Math.sqrt(n); i++) {
                while (n % i == 0) {
                    sb.append(" " + i + " " + "*");
                    n /= i;
                }
                if (n == 1) {
                    break;
                }
            }
            if (n != 1) {
                sb.append(" " + n);
            }
            if (sb.charAt(sb.length() - 1) == '*') {
                sb.deleteCharAt(sb.length() - 1);
                sb.deleteCharAt(sb.length() - 1);
            }
            System.out.println(sb);

        }
        scanner.close();
    }
}
