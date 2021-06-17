import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/6/16 23:22
 * 记录错误文件
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        while (scanner.hasNext()) {
            String str = scanner.next();
            String num = scanner.next();
            String[] arr = str.split("\\\\");
            str = arr[arr.length - 1];
            if (str.length() > 16) {
                str = str.substring(str.length() - 16);
                str += " " + num;
                if (!map.containsKey(str)) {
                    list.add(str);
                    map.put(str,1);
                } else {
                    map.put(str,map.get(str) + 1);
                }
            }
        }
        int start = 0;
        if (list.size() > 8) {
            start = list.size() - 8;
        }
        for (int i = start; i < list.size(); i++) {
            System.out.println(list.get(i) + " " + map.get(list.get(i)));
        }
    }
}
