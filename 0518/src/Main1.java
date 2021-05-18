import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/18 19:45
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            Double a = scanner.nextDouble();
            Double b = scanner.nextDouble();
            Double c = scanner.nextDouble();
            if ((a + b > c) && (a + c > b) && (b + c > a) && (Math.abs(a - b) < c) && (Math.abs(a - c) < b) && (Math.abs(b - c) < a)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
