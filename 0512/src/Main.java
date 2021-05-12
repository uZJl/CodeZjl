import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/12 20:26
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if(arr[i] <= a) {
                    a += arr[i];
                } else {
                    a += helper(a,arr[i]);
                }
            }
            System.out.println(a);
        }
        scanner.close();
    }
    public static int helper(int a, int b) {
        int max = a > b ? a : b;
        int min = a < b ? a : b;
        int c = max % min;
        if(c == 0) {
            return min;
        }else {
            return helper(c,min);
        }
    }
}
