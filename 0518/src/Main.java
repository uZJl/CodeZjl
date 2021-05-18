import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/18 16:29
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            Double n = scanner.nextDouble();
            Double r = scanner.nextDouble();
            if (n < (2 * 3.14 * r)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scanner.close();
    }
}
