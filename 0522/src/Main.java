import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/22 17:03
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c >= 'A' && c <= 'Z') {
                    char temp = (char)(c > 'E' ? (c - 5) : (c + 21));
                    sb.append(temp);
                } else {
                    sb.append(c);
                }
            }
            System.out.println(sb.toString());

        }
        scanner.close();
    }
}
