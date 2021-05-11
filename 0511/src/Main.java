import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/11 19:04
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            String op = scanner.next();
            if (n > 4) {
                moreFour(n,op);
            } else {
                lessFour(n,op);
            }
        }
        scanner.close();
    }
    public static void moreFour(int n,String op) {
        char[] ch = op.toCharArray();
        int start = 1;
        int cur = 1;
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            if (start == 1 && cur == 1 && c == 'U') {
                //第一页的第一行 Up
                cur = n;
                start = cur - 3;
            } else if (start == (n - 3) && cur == n && c == 'D') {
                //最后一页最后一行 Down
                start = 1;
                cur = 1;
            } else if (start == cur && c == 'U') {
                //不在第一页也不在最后一页，在第一行 Up
                start--;
                cur--;
            } else if ((start + 3) == cur && c == 'D') {
                //不在第一页也不在最后一页，在第最后一页 Down
                start++;
                cur++;
            } else if (c == 'U') {
                //Up
                cur--;
            } else {
                //Down
                cur++;
            }
        }
        System.out.println(start + " " + (start + 1) + " " + (start + 2) + " " + (start + 3));
        System.out.println(cur);
    }
    public static void lessFour(int n,String op) {
        char[] ch = op.toCharArray();
        int start = 1;
        int cur = 1;
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            if (cur == 1 && c == 'U') {
                cur = n;
            } else if (cur == n && c == 'D') {
                cur = start;
            } else if (c == 'U') {
                cur--;
            } else {
                cur++;
            }
        }
        for (int i = 1; i <= n; i++) {
            if(i != n) {
                System.out.print(i + " ");
            } else {
                System.out.println(i);
            }
        }
        System.out.println(cur);
    }
}
