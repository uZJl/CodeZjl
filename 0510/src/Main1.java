import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/10 20:11
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String str1 = scanner.next();
            String str2 = scanner.next();
            scanner.close();
            System.out.println(helper(str1,str2));
    }
    public static int helper(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int res = 0;
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if(Character.toUpperCase(str1.charAt(i - 1)) == Character.toUpperCase(str2.charAt(j - 1))) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                res = Math.max(res,dp[i][j]);
            }
        }
        return res;
    }
}
