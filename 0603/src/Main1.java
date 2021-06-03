import java.util.Scanner;

/**
 * Created by JiaLe on 2021/6/3 14:47
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            int[] dp = new int[n];
            for (int i = 0; i < n; i++) {
                dp[i] = 1;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (nums[i] > nums[j]) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
            }
            int res = 0;
            for (int count : dp) {
                res = Math.max(count,res);
            }
            System.out.println(res);
        }
        scanner.close();
    }
}
