import java.util.Arrays;

/**
 * Created by JiaLe on 2021/6/9 15:37
 * 挖坑填数法
 */
public class quickSort {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        sort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int[] arr,int left, int right) {
        if (left < right) {
            int mid = partition(arr,left,right);
            sort(arr,left,mid - 1);
            sort(arr,mid + 1,right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int i = left;
        int j = right;
        int pivot = arr[i];
        while (i < j) {
            while (i < j && arr[j] >= pivot) {
                j--;
            }
            if (i < j) {
                arr[i] = arr[j];
            }
            while (i < j && arr[i] <= pivot) {
                i++;
            }
            if (i < j) {
                arr[j] = arr[i];
            }
        }
        arr[i] = pivot;
        return i;
    }
}
