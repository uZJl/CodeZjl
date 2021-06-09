import java.util.Arrays;

/**
 * Created by JiaLe on 2021/6/9 10:47
 */
public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        int count = 0;
        //第一轮比较
        for (int i = 0; i < arr.length - 1; i++) {
            //第二轮比较
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("一共比较了:" + count + "次");
    }
}
