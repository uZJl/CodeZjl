/**
 * Created by JiaLe on 2021/1/31 12:21
 */
import java.util.*;
public class TestDemo {
    public static void insertSort(int[] array) {
        for(int i = 1;i < array.length;i++) {
            int tmp = array[i];
            int j = i-1;
            for(;j >= 0;j--) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                } else {
                    break;
                }
            }
            array[j+1]=tmp;
        }
    }


    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for(int j = i + 1;j < array.length;j++) {
                if(array[j] < array[i]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }



    public static int pivot(int[] array,int start,int end) {
        int tmp = array[start];
        while (start < end) {
            while (array[end] >= tmp && start < end) {
                end--;
            }
            //把数据赋值给start
            array[start] = array[end];
            while (array[start] <= tmp && start < end) {
                start++;
            }
            //把start下标的值给end
            array[end] = array[start];
        }
        array[start] = tmp;
        return start;
    }


    public static void main(String[] args) {
        int[] array = {10,3,2,7,19,78,65,127};
        System.out.println(Arrays.toString(array));
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
