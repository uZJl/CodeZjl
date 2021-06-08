import java.util.Scanner;

/**
 * Created by JiaLe on 2021/6/8 22:39
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            String[] arr = str.split("_");
            StringBuilder sb = new StringBuilder(arr[0]);
            for (int i = 1; i < arr.length; i++) {
                char c = (char)(arr[i].charAt(0) - 'a' + 'A');
                sb.append(c);
                for (int j = 1; j < arr[i].length(); j++) {
                    sb.append(arr[i].charAt(j));
                }
            }
            System.out.println(sb);
        }
        scanner.close();
    }
}
