/**
 * Created by JiaLe on 2021/4/18 19:20
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //输入 5 7
        //输出 35
//        int i = Math.max(A,B);
//        int ans = 0;
//        for(;i <= A * B; i++){
//            if(i % A == 0 && i % B == 0) {
//                ans = i;
//            }
//        }
//        System.out.println(ans);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int ret = helper(A,B);
        System.out.println(A * B / ret);
    }
    public static int helper(int A,int B) {
        if(A < B) {
            int temp = A;
            A = B;
            B = temp;
        }
        if(A % B == 0) {
            return B;
        }
        return helper(B,A % B);
    }

}
