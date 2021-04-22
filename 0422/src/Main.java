import java.util.Scanner;
/**
 * Created by JiaLe on 2021/4/22 22:08
 */

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int a = in.nextInt();
            StringBuilder str = new StringBuilder("");
            while(a > 0) {
                int n = a & 1;
                str.append(n);
                a >>= 1;
            }
            int count = 0;
            int max = 0;
            for(char ch : str.toString().toCharArray()) {
                if(ch == '0') {
                    count = 0;
                } else {
                    count++;
                    max = Math.max(count,max);
                }
            }
            System.out.println(max);
        }
    }
}