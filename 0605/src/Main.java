import java.util.Scanner;

/**
 * Created by JiaLe on 2021/6/5 20:40
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    sb.append(str.charAt(i));
                }
            }
            System.out.println(sb);
        }
    }
}
