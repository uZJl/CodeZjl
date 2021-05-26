import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/26 18:31
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            long res = 0;
            for (int i = from; i <= to; i++) {
                res += fab(i);
            }
            System.out.println(res);
        }
        scanner.close();
    }

    public static long fab(int n) {
        if (n < 2) return n;
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}
