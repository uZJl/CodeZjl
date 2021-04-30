import java.util.Scanner;

/**
 * Created by JiaLe on 2021/4/29 16:02
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            count(n);
        }
        scanner.close();
    }
    public static void count(int n) {
        int count = 0;
        for(int i = 1; i <= n; i++) {
            if(isPrefect(i)) {
                count++;
            }
        }
        System.out.println(count);;
    }
    public static boolean isPrefect(int n) {
        boolean flag = false;
        int sum = 0;
        for(int i = 1; i <= n / 2; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }
        if(sum == n) {
            flag = true;
        } else {

        }
        return flag;
    }
}

