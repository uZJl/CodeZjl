import java.util.*;

/**
 * Created by JiaLe on 2021/5/28 16:27
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();
            List<String> list = new ArrayList<>();
            char[] arr = str1.toCharArray();
            int i = 0;
            //Joe,Kewell,Leon
            //Joe
            //"Letendre, Bruce",Joe,"Quan, William"
            //William
            while (i < arr.length) {
                StringBuilder sb = new StringBuilder();
                if (arr[i] != '\"') {
                    while (arr[i] != ',' && i < arr.length) {
                        sb.append(arr[i]);
                        i++;
                    }
                    list.add(sb.toString());
                } else {
                    i++;
                    while (arr[i] != '\"') {
                        sb.append(arr[i]);
                        i++;
                    }
                    list.add(sb.toString());
                    if (i != arr.length - 1) {
                        i += 2;
                    }
                }
                }
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).equals(str2)) {
                    System.out.println("Important!");
                }
            }
            System.out.println("Ignore");
            }
        }


}
