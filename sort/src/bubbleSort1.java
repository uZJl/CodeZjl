import java.util.Arrays;

/**
 * Created by JiaLe on 2021/6/9 10:47
 * 一般冒泡排序也就是这样写。但是这段程序有个缺点，
 * 就是当排序过程中已经将数组元素排序完成，
 * 但此时它仍然会去比较，这就做了无用功了，
 * 所以我们可以通过一个boolean变量来优化这段代码，
 * 上面的程序中我们已经得出了比较次数为105次
 */
public class bubbleSort1 {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        int count = 0;
        //第一轮比较
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            //第二轮比较
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
                count++;
            }
            if (flag) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("一共比较了:" + count + "次");
    }
}
