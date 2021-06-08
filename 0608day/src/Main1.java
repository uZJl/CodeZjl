import java.util.Scanner;

/**
 * Created by JiaLe on 2021/6/8 23:06
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            String[] arr = str.split("[^a-zA-Z]+");
            StringBuilder sb = new StringBuilder();
            for (int i = arr.length - 1; i >= 0; i--) {
                sb.append(arr[i] + " ");
            }
            System.out.println(sb.toString().trim());
        }
        scanner.close();
    }
}
