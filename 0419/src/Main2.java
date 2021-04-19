import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/4/19 19:42
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] str = s.trim().split(" ");
        int[] arr = new int[str.length - 1];
        int k = Integer.parseInt(str[str.length - 1]);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        int[] res = quickSearch(arr,0,arr.length - 1,k - 1);
        Arrays.sort(res);
        for (int i = 0; i < res.length - 1; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println(res[res.length - 1]);
        return;
    }
    public static int[] quickSearch(int[] nums, int low, int high, int k) {
        int j = partition(nums,low,high);
        if(j == k) {
            return Arrays.copyOf(nums,j + 1);
        }
        return j > k ? quickSearch(nums,low,j-1,k) : quickSearch(nums, j+1,high,k);
    }

    public static int partition(int[] nums, int low, int high) {
        int v =nums[low];
        int i = low;
        int j = high + 1;
        while(true) {
            while(++i <= high && nums[i] < v);
            while(--j >= low && nums[j] > v);
            if(i >= j) {
                break;
            }
            int t = nums[j];
            nums[j] = nums[i];
            nums[i] = t;
        }
        nums[low] = nums[j];
        nums[j] = v;
        return j;
    }
}
