import java.util.Scanner;

/**
 * Created by JiaLe on 2021/6/16 22:18
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(getMax(arr,n,k,d));
    }

    public static long getMax(int[] arr, int n, int k, int d) {
        long[][] maxValue = new long[n + 1][k + 1];
        long[][] minValue = new long[n + 1][k + 1];
        for (int i = 1; i <= n; i++) {
            maxValue[i][1] = minValue[i][1] = arr[i];
        }
        long max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                for (int l = i - 1; i - l <= d && l > 0; l--) {
                    maxValue[i][j] = Math.max(maxValue[i][j],
                            Math.max(maxValue[l][j - 1]*arr[i],minValue[l][j - 1]*arr[i]));
                    minValue[i][j] = Math.min(minValue[i][j],
                            Math.min(maxValue[l][j - 1]*arr[i],minValue[l][j - 1]*arr[i]));
                }
            }
            max = Math.max(maxValue[i][k],max);
        }
        return max;
    }
}
