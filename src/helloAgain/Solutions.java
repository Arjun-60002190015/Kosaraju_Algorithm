package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    int[][][] dp;
    public int numberOfPaths(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        dp = new int[m][n][51];
        for(int[][] g:dp){
            for(int[] gf:g){
                Arrays.fill(gf, -1);
            }
        }
        return helper(0, 0, grid, k, 0);

    }

    public int helper(int i, int j, int[][] grid, int k, int sum){
        if(i<0 || i>= grid.length || j<0 || j>=grid[0].length)
            return 0;
        sum+= grid[i][j];
        if(i==grid.length-1 && j==grid[0].length)
            return sum%k==0?1:0;
        if(dp[i][j][sum%k]!=-1)
            return dp[i][j][sum%k];
        dp[i][j][sum%k] = (helper(i+1, j, grid, k, sum) + helper(i, j+1, grid, k, sum))%1000000007;
        return dp[i][j][sum%k];

    }


    public static void main(String[] args){
        String s = "(]";

        //System.out.println(isValid(s));

    }

}
