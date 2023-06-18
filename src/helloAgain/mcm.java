package helloAgain;

//Palindrome Partitioning memoized

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class mcm {
    int mod = (int)(1e9+7);
    public int countPaths(int[][] grid) {
        int m = grid.length;
        int n=  grid[0].length;
        int[][] dp = new int[m+1][n+1];
        for(int[] i:dp){
            Arrays.fill(i, -1);
        }
        int path = 0;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                path  = (path + helper(grid, i, j, m, n, dp, -1))%mod;
            }
        }
        return path;

    }

    public int helper(int[][] grid, int i, int j, int m, int n, int[][] dp, int prev){
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j]<=prev)
            return 0;

        if(dp[i][j]!=-1)
            return dp[i][j];

        int down = helper(grid, i+1, j, m, n, dp, grid[i][j]);
        int up = helper(grid, i-1, j, m, n, dp, grid[i][j]);
        int left = helper(grid, i, j+1, m, n, dp, grid[i][j]);
        int right = helper(grid, i, j-1, m, n, dp, grid[i][j]);
        return dp[i][j] = (1+ up+down+left+right)%mod;
    }

    }