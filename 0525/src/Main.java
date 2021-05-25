import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/25 22:48
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str1 = scanner.next();
            String str2 = scanner.next();
            int len1 = str1.length();
            int len2 = str2.length();
            int count = 0;
            if (len1 < len2) {
                System.out.println(0);
            } else {
                for (int i = 0; i <= len1 - len2; i++) {
                    if (str1.charAt(i) == str2.charAt(0)) {
                        int j = 0;
                        int k = i;
                        for (; j < len2; j++) {
                            if (str1.charAt(k) == str2.charAt(j)) {
                                k++;
                            } else {
                                break;
                            }
                        }
                        if (j == len2) {
                            count++;
                            i = k - 1;
                        }
                    }
                }
                System.out.println(count);
            }
        }
        scanner.close();
    }
}
