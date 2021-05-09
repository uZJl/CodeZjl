import com.sun.org.apache.xalan.internal.res.XSLTErrorResources_zh_TW;

import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/9 20:25
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            System.out.println(helper(str1,str2));
        }
        scanner.close();
    }
    public static String helper(String str1, String str2) {
        int max = Math.max(str1.length(),str2.length());
        int min = Math.min(str1.length(),str2.length());
        String maxs = (str1.length() == max) ? str1 : str2;
        String mins = (str2.length() == min) ? str2 : str1;
        for(int i = 0; i < min; i++) {
            for(int j = 0, k = min - i; k != min + 1; j++, k++) {
                if(maxs.contains(mins.substring(j,k))) {
                    return mins.substring(j,k);
                }
            }
        }
        return null;
    }
}
