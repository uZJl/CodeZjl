import java.util.*;

/**
 * Created by JiaLe on 2021/5/31 21:44
 */
public class Main {
    public static int[] opX = {1,0,-1,0};
    public static int[] opY = {0,1,0,-1};
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            char[][] arr = new char[n][m];
            int x = 0;
            int y = 0;
            for (int i = 0; i < n; i++) {
                //String str = scanner.nextLine();不能用
                String str = scanner.next();
                for (int j = 0; j < m; j++) {
                    arr[i][j] = str.charAt(j);
                    if (arr[i][j] == '@') {
                        x = i;
                        y = j;
                    }
                }
            }
            int res = dfs(x,y,arr);
            System.out.println(res);
        }
        scanner.close();
    }
    public static int dfs (int x,int y,char[][] arr) {
        int res = 1;
        arr[x][y] = '#';
        for (int i = 0; i < 4; i++) {
            int a = x + opX[i];
            int b = y + opY[i];
            if (a >= 0 && a < arr.length && b >= 0 && b < arr[0].length && arr[a][b] == '.'){
                res += dfs(a,b,arr);
            }
        }
        return res;
    }
}
