import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/8 11:38
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String str1 = scanner.next();
            String str2 = scanner.next();
            System.out.println(helper(str1,str2));
        }
        scanner.close();
    }
    public static boolean helper(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        for(int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j],dp[i][j - 1]);
                }
            }
        }
        int len3 = 0;
        for(int i = 0; i < len1; i++) {
            if (str1.charAt(i) != '?' && str1.charAt(i) != '*') {
                len3++;
            } else {

            }
        }
        if(len3 == dp[len1][len2]) {
            return true;
        } else {
            return false;
        }
    }
}
