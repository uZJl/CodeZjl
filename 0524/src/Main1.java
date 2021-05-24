import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/24 19:53
 */
public class Main1 {
    public static void main(String[] args) {
        int[] arr = new int[100001];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i <= 100000; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1000000;
        }
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n < 25) {
                System.out.printf("%d\n", arr[n]);
            } else {
                System.out.printf("%06d\n", arr[n]);
            }
        }
        scanner.close();
    }
}
