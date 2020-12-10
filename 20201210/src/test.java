import java.util.*;
public class test {

    public static void main(String[] args) {
        int[] arr=new int[100];
        int n=0;
        for (int i = 0; i <arr.length; i++) {
            n++;
            arr[i]=n;
        }
        System.out.println(Arrays.toString(arr));
    }
}
