import java.util.Scanner;

/**
 * Created by JiaLe on 2021/4/27 22:01
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            int res = findNumberOf1(n);
            System.out.println(res);
        }
    }
    public static int findNumberOf1(int num){
        int count = 0;
        while(num > 0) {
            if(num % 2 == 0) {
                num /= 2;
            } else {
                count++;
                num /= 2;
            }
        }
        return count;
    }
}
