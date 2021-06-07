import java.util.*;

/**
 * Created by JiaLe on 2021/6/7 20:25
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String number = "222333444555666777788899991234567890";
        HashMap<Character,Character> map = new HashMap<>();
        for (int i = 0; i < letter.length(); i++) {
            map.put(letter.charAt(i),number.charAt(i));
        }
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String str = scanner.next();
                str = str.replace("-","");
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < 7; j++) {
                    sb.append(map.get(str.charAt(j)));
                }
                String res = sb.substring(0,3).toString() + "-" + sb.substring(3,7).toString();
                if (!list.contains(res)) {
                    list.add(res);
                }
            }
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
            System.out.println();
        }
    }
}
