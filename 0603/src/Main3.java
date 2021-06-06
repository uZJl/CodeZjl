import java.util.Scanner;
import java.util.Stack;

/**
 * Created by JiaLe on 2021/6/3 22:35
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.next();
            }
            Stack<Integer> s = new Stack<>();
            for (int i = 0; i < n; i++) {
                if (arr[i].equals("+")) {
                    s.push(s.pop() + s.pop());
                } else if (arr[i].equals("*")) {
                    s.push(s.pop() * s.pop());
                } else if (arr[i].equals("-")) {
                    int a = s.pop();
                    int b = s.pop();
                    s.push(b - a);
                } else if (arr[i].equals("-")) {
                    int a = s.pop();
                    int b = s.pop();
                    s.push(b / a);
                } else {
                    s.push(Integer.parseInt(arr[i]));
                }
            }
            System.out.println(s.pop());
        }
    }
}
