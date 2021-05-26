import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/26 22:26
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            long res = fab(n);
            System.out.println(res);
        }
        scanner.close();
    }
    public static long fab(int n) {
        if (n < 2) {
            return n;
        }
        long[] arr = new long[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
}
