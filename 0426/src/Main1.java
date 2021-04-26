import java.util.Scanner;

/**
 * Created by JiaLe on 2021/4/26 15:00
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            if(n == m) {
                System.out.println(0);
                return;
            }
            int[] dp = new int[m + 1];
            for (int i = 0; i <= m; i++) {
                dp[i] = Integer.MAX_VALUE;
            }
            dp[n] = 0;
            for(int i = n; i < m; i++) {
                if(dp[i] == Integer.MAX_VALUE) {
                    continue;
                }
                for(int j = 2; j <= Math.sqrt(i); j++) {
                    if(i % j == 0) {
                        if(i + j <= m) {
                            dp[i + j] = Math.min(dp[i + j], dp[i] + 1);
                        }
                        if(i + (i / j) <= m) {
                            dp[i + (i / j)] = Math.min(dp[i + (i / j)], dp[i] + 1);
                        }
                    }
                }
            }
            if(dp[m] == Integer.MAX_VALUE) {
                System.out.println(-1);
            } else {
                System.out.println(dp[m]);
            }
    }
}
