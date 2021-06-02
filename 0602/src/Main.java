import java.util.Scanner;

/**
 * Created by JiaLe on 2021/6/2 20:59
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s1 = scanner.next();
            String s2 = scanner.next();
            int len1 = scanner.nextInt();
            int len2 = scanner.nextInt();

            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();

            int[] dp = new int[len2 + 1];

            int ans = 0;

            for (int i = 1; i <= len2; i++) {
                dp[i] = (dp[i - 1] * 26) % 1000007;

                if (i <= s1.length()) {
                    dp[i] = dp[i] - (ch1[i - 1] - 96);
                }

                if (i <= s2.length()) {
                    dp[i] = dp[i] + (ch2[i - 1] - 96);
                }

                if (i >= len1) {
                    ans += dp[i];
                }
            }
            System.out.println(ans - 1);
        }
        scanner.close();
    }
}
