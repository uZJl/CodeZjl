import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/25 22:48
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str1 = scanner.next();
            String str2 = scanner.next();
            int len1 = str1.length();
            int len2 = str2.length();
            int count = 0;
            int i = 0;
            while (i <= len1 - len2) {
                if (str1.charAt(i) == str2.charAt(0)) {
                    int k = i;
                    int j = 0;
                    for (; j < len2; j++) {
                        if (str1.charAt(k) == str2.charAt(j)) {
                            k++;
                        } else {
                            break;
                        }
                    }
                    if (j == len2) {
                        count++;
                        i = i + len2;
                    } else {
                        i++;
                    }
                } else {
                    i++;
                }
            }
            System.out.println(count);
        }
        scanner.close();
    }
}
