import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/9 19:45
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            int num = scanner.nextInt();
            if(num == 0) {
                flag = false;
            } else {
                list.add(num);
            }
        }
        for(int num : list) {
            System.out.println(helper(num));
        }
    }
    public static int helper(int num) {
        int count = 0;
        while (num >= 3) {
            int n1 = num / 3;
            count += n1;
            num = (num - n1 * 2);
        }
        if(num == 2) {
            count++;
        }
        return count;
    }
}
