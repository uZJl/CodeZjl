import java.util.Scanner;

/**
 * Created by JiaLe on 2021/4/21 19:41
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a = 0;
        int b = 1;
        while(b < N) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        System.out.println(Math.min(Math.abs(b - N),Math.abs(a - N)));
    }
}



