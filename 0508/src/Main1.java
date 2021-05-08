import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/8 12:17
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int m = scanner.nextInt();
            System.out.println(getTotalCount(m));
        }
        scanner.close();
    }
    public static int getTotalCount(int month) {
        if(month <= 2) {
            return 1;
        } else {
            return getTotalCount(month - 1) + getTotalCount(month - 2);
        }
    }
}
