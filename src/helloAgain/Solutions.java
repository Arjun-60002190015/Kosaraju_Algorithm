package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    int count = 0;
    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        for(int i= 0 ;i< grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    count = 0;
                    dfs(i, j, grid);

                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }

    public void dfs(int i, int j, int[][] grid){
        if(i<0 || i>= grid.length || j<0 || j>=grid[0].length || grid[i][j]==0)
            return;
        count++;
        grid[i][j] = 0;
        dfs(i+1, j, grid);
        dfs(i-1, j, grid);
        dfs(i, j+1, grid);
        dfs(i, j-1, grid);
    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
