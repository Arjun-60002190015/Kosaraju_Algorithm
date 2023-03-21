package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] row = new int[n];
        int[] col = new int[m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j]>row[i])
                    row[i] = grid[i][j];
                if(grid[i][j]>col[j])
                    col[j] = grid[i][j];
            }
        }
        int ans = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                int min = row[i]>col[j]?row[i]:col[j];
                ans += min - grid[i][j];
            }
        }
        return ans;

    }



    public static void main(String[] args){

        int[] nums = {-5, 8, -14, 2, 4, 12};
        //System.out.println(maxSub(nums, -5));

    }

}
