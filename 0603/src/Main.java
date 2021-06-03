import java.util.Scanner;

/**
 * Created by JiaLe on 2021/6/3 14:26
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            //错排算法
            if (n <= 1) {
                System.out.println(0);
            } else {
                long[] dp = new long[n + 1];
                dp[1] = 0;
                dp[2] = 1;
                for (int i = 3; i <= n; i++) {
                    dp[i] = (i - 1) * (dp[i - 1] + dp[i - 2]);
                }
                System.out.println(dp[n]);
            }
        }
        scanner.close();
    }
}
