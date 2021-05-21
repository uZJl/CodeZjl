import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/21 22:05
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int count = 0;
            long n = scanner.nextLong();
            if(n == 0) {
                return;
            }
            while (n != 1) {
                if (n % 3 == 0) {
                    n /= 3;
                    count++;
                } else {
                    n = n / 3 + 1;
                    count++;
                }
            }
            System.out.println(count);
        }
        scanner.close();
    }
}
