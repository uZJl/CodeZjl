/**
 * Created by JiaLe on 2021/4/14 20:29
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int M = in.nextInt();
            int N = in.nextInt();
            if(M == 0) {
                System.out.println(0);
                return;
            }
            String test = "0123456789ABCDEF";
            boolean flag = true;
            if(M < 0) {
                M = -M;
                flag = false;
            }
            StringBuilder res = new StringBuilder();
            while(M != 0) {
                res.append(test.charAt(M % N));
                M /= N;
            }
            String ans = flag == true ? res.reverse().toString() : res.append('-').reverse().toString();
            System.out.println(ans);
            return;
        }
    }
}
