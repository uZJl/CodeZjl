import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/19 20:00
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            double n = scanner.nextInt();
            if (n == 0) {
                return;
            }
            long x = (long) (Math.pow(5,n) - 4);
            long y = (long) (Math.pow(4,n) - 4 + n);
            System.out.println(x + " " + y);
        }
        scanner.close();
    }
}
