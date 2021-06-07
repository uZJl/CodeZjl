import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by JiaLe on 2021/6/7 21:24
 */
public class Main2 {
    static ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    static ArrayList<Integer> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            dfs(n,m,1);
            for(int i = 0; i < res.size(); i++) {
                ArrayList<Integer> l = res.get(i);
                int j = 0;
                for(; j < l.size() - 1; j++) {
                    System.out.print(l.get(j) + " ");
                }
                System.out.println(l.get(j));
            }
        }
    }
    public static void dfs(int n, int m, int index) {
        if (m == 0) {
            res.add(new ArrayList<>(list));
        } else {
            for (int i = index; i <= m && i <= n; i++) {
                list.add(i);
                dfs(n,m - i,i + 1);
                list.remove(list.size() - 1);
            }
        }
    }
}
