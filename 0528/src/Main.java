import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/28 15:39
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            double res = dp(n) / sum(n);

            System.out.printf("%.2f",100 * res);
            System.out.println("%");
        }
        scanner.close();
    }
    public static double sum(int n) {
        if (n == 0) return 1;
        double count = 1;
        for (int i = 1; i <= n; i++) {
            count *= i;
        }
        return count;
    }

    public static double dp(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;

        return (n - 1) * (dp(n - 2) + dp(n - 1));
    }
}
