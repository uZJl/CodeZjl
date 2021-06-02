import java.util.*;

/**
 * Created by JiaLe on 2021/6/2 22:47
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s1 = scanner.next();
            String s2 = scanner.next();
            int len1 = s1.length();
            int len2 = s2.length();
            int[][] dp = new int[len1 + 1][len2 + 1];

            for (int i = 1; i <= len1; i++) {
                for (int j = 1; j <= len2; j++) {
                    if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j],
                                Math.max(dp[i][j - 1], dp[i - 1][j - 1]));
                    }
                }
            }
            System.out.println(dp[len1][len2]);
        }
        scanner.close();
    }
}
