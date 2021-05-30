import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by JiaLe on 2021/5/30 19:54
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n; i ++) {
                String id = scanner.next();
                String op = scanner.next();
                list.add(op);
            }
            Stack<String> stack = new Stack<>();
            int max = 0;
            int ret = 0;
            for (int i = 0; i < list.size(); i++) {
                stack.push(list.get(i));
                if (list.get(i).equals("connect")) {
                    max++;
                } else {
                    stack.pop();
                    max--;
                }
                ret = Math.max(max,ret);
            }
            System.out.println(ret);
        }
    }
}
