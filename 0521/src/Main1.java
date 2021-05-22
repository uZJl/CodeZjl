/**
 * Created by JiaLe on 2021/5/22 10:24
 */
public class Main1 {

    /**
     *	正数数组中的最小不可组成和
     *	输入：正数数组arr
     *	返回：正数数组中的最小不可组成和
     */
    public int getFirstUnFormedNum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j + 1 < arr.length; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int min = arr[0];
        int[][] dp = new int[arr.length + 1][sum + 1];
        for (int j = min; j <= sum; j++) {
            for (int i = 1; i <= arr.length; i++) {
                if (j - arr[i - 1] >= 0) {
                    dp[i][j] = Math.max(dp[i - 1][j - arr[i - 1]] + arr[i - 1], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
            if (dp[arr.length][j] != j) {
                return j;
            }
        }
        return sum + 1;
    }

}

