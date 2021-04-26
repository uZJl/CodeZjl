import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/4/26 19:08
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] ball = new int[n];
            for (int i = 0; i < n; i++) {
                ball[i] = scanner.nextInt();
            }
            Arrays.sort(ball);
            System.out.println(helper(ball,0,0,1,n));
            return;
        }
    }
    public static int helper(int[] arr,int index,int sum,long mul,int len) {
        int res = 0;
        for (int i = index; i < len; i++) {
            sum += arr[i];
            mul *= arr[i];
            if(sum > mul) {
                res += 1 + helper(arr,i + 1,sum,mul,len);
            } else if (arr[i] == 1) {
                res += helper(arr,i + 1,sum,mul,len);
            } else {
                break;
            }
            sum -= arr[i];
            mul /= arr[i];
            while(i < len - 1 && arr[i] == arr[i + 1]) {
                i++;
            }
        }
        return res;
    }
}
