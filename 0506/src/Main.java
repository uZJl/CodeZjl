import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/6 19:31
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int res = helper(n);
            System.out.println(res);
        }
        scanner.close();
    }
    public static int helper(int n) {
        int ans = 0;
        if(n <= 2)
        {
            ans = -1;
        } else {
            if(n % 4 == 0) ans = 3;
            if(n % 4 == 1) ans = 2;
            if(n % 4 == 2) ans = 4;
            if(n % 4 == 3) ans = 2;
        }
        return ans;
    }
}
