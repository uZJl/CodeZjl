import java.util.Scanner;

/**
 * Created by JiaLe on 2021/4/23 21:49
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int left = 0;
        int right = 0;
        for(int i = 2; i <= n / 2; i++) {
            if(helper(i)) {
                if(helper(n -  i)) {
                    left = i;
                    right = n - i;
                }
            }
        }
        System.out.println(left);
        System.out.println(right);

    }
    public static boolean helper(int num) {
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
