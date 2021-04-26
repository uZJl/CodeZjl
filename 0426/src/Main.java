import java.util.Scanner;

/**
 * Created by JiaLe on 2021/4/26 14:31
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        int cnum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '\"') {
                cnum++;
                continue;
            }
            if(c != ' ') {
                sb.append(c);
            } else if(cnum % 2 == 0) {
                count++;
                sb.append('\n');
            } else {
                sb.append(' ');
            }
        }
        System.out.println(++count);
        System.out.println(sb);
    }
}
