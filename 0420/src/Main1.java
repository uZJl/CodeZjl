import java.util.Scanner;

/**
 * Created by JiaLe on 2021/4/20 22:37
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        while(n != 0) {
            sb.append(n % 10);
            n /= 10;
        }
        System.out.println(sb);
    }
}
