package helloAgain;


import javafx.scene.layout.Priority;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.sql.Array;
import java.util.*;



public class Solutions {
    Integer[][][] dp;
    int mod = (int)1e9+7;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        dp = new Integer[m][n][maxMove+1];
        int[][] grid = new int[m][n];
        int ans = helper(grid, dp, maxMove, startRow, startColumn) % mod;
        return ans;

    }

    public int helper(int[][] grid, Integer[][][] dp, int k, int i, int j){
        if(i<0 || i>= grid.length || j<0 || j>= grid[0].length)
            return 1;
        if(k==0) return 0;
        if(dp[i][j][k]!=null) return dp[i][j][k] % mod;

        int max = 0;
        max = (helper(grid, dp, k-1, i+1, j) % mod+
                helper(grid, dp, k-1, i-1, j) % mod) % mod+
                (helper(grid, dp, k-1, i, j+1)%mod+
                        helper(grid, dp, k-1, i, j-1)% mod) % mod;
        return dp[i][j][k] = (max%mod);
    }
    public static void main(String[] args){

    }

}
