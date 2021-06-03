import java.util.Scanner;

/**
 * Created by JiaLe on 2021/6/3 22:35
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            char[][] map = new char[20][20];
            for (int i = 0; i < 20; i++) {
                String s = scanner.next();
                for (int j = 0; j < 20; j++) {
                    map[i][j] = s.charAt(j);
                }
            }
            if (helper(map)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        scanner.close();
    }
    public static boolean helper(char[][] map) {
        int[][] op = {{0, 1}, {0, - 1}, {1, 0}, { - 1, 0}, {1, 1}, {1, - 1}, { - 1, 1}, { - 1, - 1}};
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (map[i][j] == '*' || map[i][j] == '+') {
                    for (int k = 0; k < 8; k++) {
                        int count = 1;
                        int x = i + op[k][0];
                        int y = j + op[k][1];
                        while (x >= 0 && y >= 0 && x < 20 && y < 20 && map[x][y] == map[i][j]) {
                            x += op[k][0];
                            y += op[k][1];
                            count++;
                        }
                        if (count == 5) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
