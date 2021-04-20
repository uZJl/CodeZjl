import java.util.Scanner;

/**
 * Created by JiaLe on 2021/4/20 22:29
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = n; i >= 5; i--) {
            int tmp = i;
            while (tmp % 5 == 0) {
                count++;
                tmp /= 5;
            }
        }
        System.out.println(count);
    }
}
