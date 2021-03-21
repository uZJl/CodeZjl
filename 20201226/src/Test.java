import java.lang.reflect.Array;
import java.util.*;
public class                                                                                                 Test {
    public static int[] func(int[] arr) {
    int left=0;
    int right=arr.length-1;
    while(left<right){
        while(arr[left]%2==0){
            left++;
        }
        while(arr[right]%2!=0){
            right--;
        }
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        }
    return arr;
    }

    public static void main1(String[] args) {
        int[] arr={5,7,89,8,6,99,5,1,2,12,63};
        System.out.println(Arrays.toString(func(arr)));
    }

    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7,8,9};
        int[] arr2={9,8,7,6,5,4,3,2,1};
        func1(arr1,arr2);
    }
    public static void func1(int[] arr1,int[] arr2){
        int temp=0;
        for (int i = 0; i <arr1.length ; i++) {
            temp=arr1[i];
            arr1[i]=arr2[i];
            arr2[i]=temp;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
