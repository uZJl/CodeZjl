import java.util.ArrayList;
import java.util.List;

/**
 * Created by JiaLe on 2021/1/22 9:23
 */
public class Test {
    public static List<Character> func(String str1, String str2) {
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < str1.length(); i++) {
            if(!str2.contains(str1.charAt(i) + "")) {
                list.add(str1.charAt(i));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List res = func("welcome to xuchang","come");
        System.out.println(res);
    }
}
