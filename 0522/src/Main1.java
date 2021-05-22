import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/22 20:14
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int count = 0;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if ((n % i) == 0) {
                    while (n % i == 0) {
                        n /= i;
                    }
                    count++;
                }
            }
            if (n != 1) {
                count++;
            }
            System.out.println(count);
        }
        scanner.close();
    }
}
