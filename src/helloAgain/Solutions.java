package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int orangesRotting(int[][] grid) {
        int l = 2;
        for(int i = 0;i< grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    dfs(i, j, 2, grid);
                }
            }
        }
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]==1) {
                    return -1;
                }
                l = Math.max(l, grid[i][j]);
            }
        }
        return l-2;

    }

    public void dfs(int i, int j, int level, int[][] grid){
        if(i<0 || i>= grid.length || j<0 || j>=grid[0].length || grid[i][j]==0
         || grid[i][j]>1 && grid[i][j]<level)
            return;
        grid[i][j] = level;
        dfs(i+1, j, level+1, grid);
        dfs(i-1, j, level+1, grid);
        dfs(i, j+1, level+1, grid);
        dfs(i, j-1, level+1, grid);
    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
