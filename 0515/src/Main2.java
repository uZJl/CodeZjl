import java.util.Scanner;
import java.util.Stack;

/**
 * Created by JiaLe on 2021/5/15 11:34
 */
class Node {
    int x;
    int y;
    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[][] maze = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    maze[i][j] = scanner.nextInt();
                }
            }
            //定义一个栈保存路径
            Stack<Node> stack = new Stack<>();
            //在一个节点处的选择
            int[][] choice ={{1,0},{0,1}};
            //记录走过的路径，当这个节点走过，则记录为1；
            int[][] visited = new int[n][m];
            Node start = new Node(0,0);
            Node end = new Node(n - 1,m - 1);
            stack.push(start);
            visited[0][0] = 1;
            while (!stack.isEmpty()) {
                Node cur = stack.peek();
                boolean flag = false;
                if(cur.x == end.x && cur.y == end.y) {
                    break;
                } else {
                    for (int i = 0; i < 2; i++) {
                        Node next = new Node(cur.x + choice[i][0],cur.y + choice[i][1]);
                        if(next.x >= 0 && next.x < n && next.y >= 0 && next.y < m && maze[next.x][next.y] == 0 && visited[next.x][next.y] == 0) {
                            stack.push(next);
                            visited[next.x][next.y] = 1;
                            flag = true;
                            break;
                        }
                    }
                    if (flag) {
                        continue;
                    } else {
                        stack.pop();
                    }
                }
            }
            Stack<Node> ans = new Stack<>();
            while (!stack.isEmpty()) {
                ans.push(stack.pop());
            }
            while (!ans.isEmpty()) {
                System.out.println("(" + ans.peek().x + "," + ans.peek().y + ")");
                ans.pop();
            }

        }
    }
}
