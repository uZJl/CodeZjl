import java.util.Arrays;

/**
 * Created by JiaLe on 2021/6/9 15:14
 */
public class shellSort {
    public static void main(String[] args) {
        int[] arr = { 3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 };
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j > gap - 1; j -= gap) {
                    if (arr[j] < arr[j - gap]) {
                        int temp = arr[j];
                        arr[j] = arr[j - gap];
                        arr[j - gap] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
