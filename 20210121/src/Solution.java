import java.util.List;

/**
 * Created by JiaLe on 2021/1/21 17:44
 */
public class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int[] arr = new int[grid.length * grid[0].length];
        int p = 0;
        for(int i = 0;i < grid.length;i++){
            for(int j = 0;j < grid[0].length;j++){
                arr[p] = grid[i][j];
                p++;
            }
        }
        int len = arr.length;
        int[] arr1 = new int[len];
        for(int i = 0;i < len;i++) {
            arr1[(k + i) % len] = arr[i];
        }
        for(int i = 0;i <= k % len;i++) {
            arr1[i] = arr[len - k % len - i];
        }

    }
}
