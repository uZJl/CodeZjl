import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/4/19 16:41
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[][] ans = helper(arr);
        for(int i = 0; i < ans.length; i++) {
            System.out.println(ans[i][0] + " " + ans[i][1]);
        }

    }
    public static int[][] helper(int[] arr) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[][] res = new int[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                int top = stack.pop();
                int leftIdx = stack.isEmpty() ? -1 : stack.peek();
                res[top][0] = leftIdx;
                res[top][1] = i;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int top = stack.pop();
            int leftIdx = stack.isEmpty() ? -1 : stack.peek();
            res[top][0] = leftIdx;
            res[top][1] = -1;
        }
        return res;
    }
}
