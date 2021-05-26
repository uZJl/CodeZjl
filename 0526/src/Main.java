import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/26 21:51
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextLine();
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                String s = arr[i];
                if (contains(s)) {
                    sb.append("\"" + s + "\"");
                    if (i != n - 1) {
                        sb.append(", ");
                    }
                } else {
                    sb.append(s);
                    if (i != n - 1) {
                        sb.append(", ");
                    }
                }
            }
            System.out.println(sb);
        }
    }
    public static boolean contains(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ',' || c == ' ') {
                    return true;
            }
        }
        return false;
    }
}
