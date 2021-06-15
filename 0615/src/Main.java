import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/6/15 21:56
 */

/*
体重升序排列，体重相同时，按身高降序排列
接下来就是按照身高数据进行最大升序子序列的长度
注意：
此题中，体重相同时，只有身高也相同才可以站在自己肩上，
比自己矮是不能站在自己肩上的。
所以如果想要排除体重相同时，只看身高相等的，不看身高矮的，所以身高降序排列
求最大升序子序列的长度，
采用动态规划
状态
F(i):以第i个数据结尾的升序子序列的最大长度
F(i) = max(F(i), F(j) + 1)，其中j < i，arr[j] <= arr[i]
状态初始值：
F(i) = 1
返回值：
max(F(i))
 */
class node implements Comparable<node> {
    int w;
    int h;
    public node(int w, int h) {
        this.w = w;
        this.h = h;
    }

    public int compareTo(node obj) {
        int ret = w - obj.w;
        //体重相等，身高降序
        if (ret == 0) {
            return obj.h - h;
        }
        return ret;
    }
}
public class Main {
    public static int getMaxLength(node[] arr, int n) {
        Arrays.sort(arr);
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        int max = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j].h <= arr[i].h) {
                    dp[i] = Math.max(dp[j] + 1,dp[i]);
                }
            }
            max = Math.max(max,dp[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            node[] arr = new node[n];
            for (int i = 0; i < n; i++) {
                scanner.nextInt();
                arr[i] = new node(scanner.nextInt(),scanner.nextInt());
            }
            System.out.println(getMaxLength(arr,n));
        }
    }
}
