import java.util.Scanner;

/**
 * Created by JiaLe on 2021/6/11 21:35
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] arr = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = scanner.nextInt();
            }
            int k1 = scanner.nextInt();
            int d = scanner.nextInt();
            long[][] dpMax = new long[k1 + 1][n + 1];
            long[][] dpMin = new long[k1 + 1][n + 1];
            long res = Integer.MIN_VALUE;
            for (int i = 1; i <= n; i++) {
                dpMax[1][i] = arr[i];
                dpMin[1][i] = arr[i];
                for (int k = 2; k <= k1; k++) {
                    for (int j = i - 1; j > 0 && i - j <= d; j--) {
                        dpMax[k][i] = Math.max(dpMax[k][i],Math.max(dpMax[k - 1][j] * arr[i],dpMin[k - 1][j] * arr[i]));
                        dpMin[k][i] = Math.min(dpMin[k][i],Math.min(dpMax[k - 1][j] * arr[i],dpMin[k - 1][j] * arr[i]));
                    }
                }
                res = Math.max(dpMax[k1][i],res);
            }
            System.out.println(res);
        }
    }
}
