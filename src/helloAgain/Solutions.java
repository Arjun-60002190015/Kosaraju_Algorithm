package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public int closedIsland(int[][] grid) {
        int count = 0;
        for(int i = 0;i< grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    if(dfs(grid, i, j))
                        count++;
                }
            }
        }
        return count;


    }

    public static boolean dfs(int[][] grid, int i, int j){
        if(i<0 || i>= grid.length || j<0 || j>= grid[0].length)
            return false;
        if(grid[i][j]==1 || grid[i][j]==2)
            return true;
        grid[i][j] = 2;
        boolean up = dfs(grid, i-1, j);
        boolean down = dfs(grid, i+1, j);
        boolean left = dfs(grid, i, j-1);
        boolean right = dfs(grid, i, j+1);
        return up&&down&&right&&left;

    }




    public static void main(String[] args){
        int[] nums = {5, 8, 6};
        int target = 4;

        //System.out.println(maximumCandies(nums, 3));

    }

}
