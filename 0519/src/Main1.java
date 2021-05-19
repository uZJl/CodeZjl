/**
 * Created by JiaLe on 2021/5/19 20:27
 */
public class Main1 {
    public static void main(String[] args) {

    }
    /**
     *	奇数位上都是奇数或者偶数位上都是偶数
     *	输入：数组arr，长度大于2
     *	将arr调整成奇数位上都是奇数或者偶数位上都是偶数
     */
    public void oddInOddEvenInEven(int[] arr) {
        int len = arr.length - 1;
        int pa = 0;
        int pb = 1;
        int tmp = 0;
        while (pa < len && pb < len) {
            if (arr[len] % 2 == 0) {
                tmp = arr[len];
                arr[len] = arr[pa];
                arr[pa] = tmp;
                pa += 2;
            } else {
                tmp = arr[len];
                arr[len] = arr[pb];
                arr[pb] = tmp;
                pb += 2;
            }
        }
        return;
    }
}
