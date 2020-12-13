import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(toString(arr));
    }
    public static String toString(int[] arr){
        String ret="[";
        for (int i = 0; i < arr.length; i++) {
            ret+=arr[i];
            if(i!=arr.length-1){
                ret += ",";
            }
        }
        return ret+="]";
    }




    public static void main4(String[] args) {
        int[] arr={1,3,5,6,44,8,55};
        System.out.println(Arrays.toString(copyOf(arr)));
    }
    public static int[] copyOf(int[] arr){
        int[] arr0=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr0[i]=arr[i];
        }
        return arr0;
    }





    public static void main3(String[] args) {
        int[] arr2={1,3,5,7,9,12};
        System.out.println(binarySearch(arr2,9));
    }
    public static int binarySearch(int[] arr,int key){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(arr[mid]>key){
                right=mid-1;
            }else if(arr[mid]<key){
                left=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main2(String[] args) {
        int[] arr1={1,3,5,9,7,8};
        if(judgeSort(arr1)){
            System.out.println("数组有序");
        }else{
            System.out.println("数组无序");
        }
    }
    public static boolean judgeSort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i+1]>arr[i]){
                return false;
            }
                return true;
        }
        return true;
    }
    public static void main1(String[] args) {
        int[] arr={1,6,8,3,4,7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++) {  //趟数
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
