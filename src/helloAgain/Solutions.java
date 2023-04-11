package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    int[][] memo;
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        memo = new int[m][n];
        for(int[] i:memo){
            Arrays.fill(i, Integer.MAX_VALUE);
        }
        return helper(dungeon, 0, 0);

    }

    public int helper(int[][] grid, int i, int j){
        if(i<0 || i>= grid.length || j<0 || j>=grid[0].length)
            return Integer.MAX_VALUE;
        if(i==grid.length-1 && j==grid[0].length-1)
            return grid[i][j]>=0? 1:-grid[i][j] +1;
        if(memo[i][j]!=Integer.MAX_VALUE)
            return memo[i][j];
        int res = Math.min(helper(grid, i+1, j), helper(grid, i, j+1)) - grid[i][j];
        return memo[i][j] = res<=0?1:res;

    }


    public static void main(String[] args){
        String s = "(]";

        //System.out.println(isValid(s));

    }

}
