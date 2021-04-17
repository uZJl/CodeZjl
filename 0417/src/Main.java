/**
 * Created by JiaLe on 2021/4/17 14:18
 */
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt();
        int H = in.nextInt();
        char[][] board = new char[H][W];
        for(int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                board[i][j] = '.';
            }
        }
        backTrack(board,0);
    }
    public static void backTrack(char[][] board,int row) {
        if(row == board.length) {
            return;
        }
        int n = board[row].length;
        for(int col = 0; col < n; col++) {
            if(!isVaild(board,row,col)) {
                continue;
            }
            board[row][col] = 'Q';
            backTrack(board,row + 1);
            board[row][col] = '.';
        }
    }

    public static boolean isVaild(char[][] board,int row,int col) {
        int n = board.length;
        for(int i = 0; i < row; i++) {
            if()
        }
        return true;
    }

}