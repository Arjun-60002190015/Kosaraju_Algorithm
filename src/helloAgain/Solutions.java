package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int maxMoves(int[][] grid) {
        int res = 0;
        int[][] dp = new int[grid.length+1][grid[0].length+1];
        for(int[] memo:dp){
            Arrays.fill(memo, -1);
        }
        for(int i = 0;i<grid.length;i++){
            res = Math.max(res, helper(grid, i, 0, dp));
        }
        return res;

    }

    public boolean move(int row, int col, int[][] grid){
        if(row<0 || row==grid.length || col<0 || col==grid[0].length)
            return false;
        return true;
    }

    public int helper(int[][] grid, int i, int col, int[][] dp){
        if(!move(i, col, grid)) return 0;
        if(dp[i][col] !=-1)
            return dp[i][col];
        int up = 0;
        int right = 0;
        int down = 0;
        if(move(i-1, col+1, grid) && grid[i][col]<grid[i-1][col+1]){
            up = 1 + helper(grid, i-1, col+1, dp);
        }

        if(move(i, col+1, grid) && grid[i][col] < grid[i][col+1]){
            right = 1 + helper(grid, i, col+1, dp);
        }

        if(move(i+1, col+1, grid) && grid[i][col]<grid[i+1][col+1]){
            down = 1 + helper(grid, i+1, col+1, dp);
        }

        return dp[i][col] = Math.max(right, Math.max(up, down));
    }


    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
