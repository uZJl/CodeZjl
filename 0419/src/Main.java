import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/4/19 16:16
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int A = 0;
        for (int i = 0; i < n; i++) {
            A = A ^ arr[i];
        }
        //提取出A右边第一个1
        int B = A & (~A + 1);
        int C = 0;
        for (int i = 0; i < n; i++) {
            if((arr[i] & B) != 0) {
                C ^= arr[i];
            }
        }
        System.out.println(Math.min(A ^ C,C) + " " + Math.max(A ^ C,C));
    }
}
