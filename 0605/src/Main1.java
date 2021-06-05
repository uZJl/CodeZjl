import java.util.Scanner;

/**
 * Created by JiaLe on 2021/6/5 21:12
 */
public class Main1 {
    static int[][] op = {{1,0},{0,1},{-1,0},{0,-1}};
    static char[][] map = new char[10][10];
    static int[][] count = new int[10][10];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            for (int i = 0; i < 10; i++) {
                map[i] = scanner.next().toCharArray();
            }
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    count[i][j] = Integer.MAX_VALUE;
                }
            }
            count[0][1] = 0;
            dfs(0,1);
            System.out.println(count[9][8]);
        }
        scanner.close();
    }
    public static void dfs(int x,int y) {
        int opX = 0;
        int opY = 0;
        for (int i = 0; i < 4; i++) {
            opX = x + op[i][0];
            opY = y + op[i][1];
            if (opX >= 0 && opX < 10 && opY >= 0 && opY < 10 && map[opX][opY] == '.') {
                if (count[opX][opY] > count[x][y] + 1) {
                    count[opX][opY] = count[x][y] + 1;
                    dfs(opX,opY);
                }
            }
        }
    }
}
