import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/16 21:51
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String n = scanner.next();
            System.out.println(helper(n));
        }
    }
    public static int helper(String num) {
        int n = 0;
        for (int i = 0; i < num.length(); i++) {
            n += (num.charAt(i) - '0');
        }
        while (n >= 10) {
            int cur = n;
            int cur1 = 0;
            while (cur > 0) {
                cur1 += cur % 10;
                cur /= 10;
            }
            n = cur1;
        }
        return n;
    }
}
