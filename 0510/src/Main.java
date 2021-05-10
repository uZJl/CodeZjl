import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/10 19:49
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                sb.append(s.charAt(s.length() - i - 1));
            }
            System.out.println(sb);
        }
        scanner.close();
    }
}
