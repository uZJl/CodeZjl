import java.util.Scanner;

public class Main1 {
    public static int a[] = new int[10002];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        a[1] = 1;
        a[2] = 2;
        for (int i = 3; i < 10001; i++) {
            a[i] = a[i - 1] + a[i - 2];
            if (a[i] > 9999)
                a[i] = a[i] % 10000;
        }
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();
                if (String.valueOf(a[num]).length() == 1)
                    sb.append("000" + a[num]);
                else if (String.valueOf(a[num]).length() == 2)
                    sb.append("00" + a[num]);
                else if (String.valueOf(a[num]).length() == 3)
                    sb.append("0" + a[num]);
                else if (String.valueOf(a[num]).length() == 4)
                    sb.append("" + a[num]);
            }
            System.out.println(sb.toString());
        }
        scanner.close();
    }
}