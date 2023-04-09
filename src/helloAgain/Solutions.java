package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {

    public static int numEnclaves(int[][] grid) {
        int ones = 0;
        for(int i = 0;i< grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(i*j==0 || i==grid.length-1 || j==grid[0].length - 1){
                    if(grid[i][j]==1)
                        dfs(grid, i, j);
                }
            }
        }
        for(int i = 0;i< grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                ones += grid[i][j];
            }
        }
        return ones;
    }

    public static void dfs(int[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>= grid[0].length || grid[i][j]==0)
            return;
        grid[i][j] = 0;
        dfs(grid, i, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
        dfs(grid, i+1, j);

    }






    public static void main(String[] args){
        int[][] nums = {{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}};

        System.out.println(numEnclaves(nums));

    }

}
