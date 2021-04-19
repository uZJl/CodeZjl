import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/4/19 20:14
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n > 1000) {
            n = 999;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int j = 0;
        while(list.size() > 1) {
            j = (j + 2) % list.size();
            list.remove(j);
        }
        System.out.println(list.get(0));
    }

}
