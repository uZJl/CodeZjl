import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/31 22:47
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            int[][] mogu = new int[k][2];
            for (int i = 0; i < k; i++) {
                mogu[i][0] = scanner.nextInt();
                mogu[i][1] = scanner.nextInt();
            }
            System.out.printf("%.2f",helper(n,m,mogu));
            System.out.println();
        }
    }

    public static double helper(int n,int m,int[][] mogu) {
        double[][] dp = new double[n + 1][m + 1];
        for (int i = 0; i < mogu.length; i++) {
            dp[mogu[i][0]][mogu[i][1]] = -1;
        }
        dp[1][1] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (dp[i][j] != -1) {
                    if (dp[i - 1][j] != -1) {
                        if (j == m) {
                            dp[i][j] += dp[i - 1][j];
                        } else {
                            dp[i][j] += dp[i - 1][j] / 2;
                        }
                    }
                    if (dp[i][j - 1] != -1) {
                        if (i == n) {
                            dp[i][j] += dp[i][j - 1];
                        } else {
                            dp[i][j] += dp[i][j - 1] / 2;
                        }
                    }
                }
            }
        }
        return dp[n][m];
    }
}