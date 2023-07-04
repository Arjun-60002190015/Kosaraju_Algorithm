package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    public int getMaximumGold(int[][] grid) {
        int max = 0;
        for(int i = 0;i< grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                max = Math.max(helper(grid, i, j), max);
            }
        }
        return max;

    }

    public int helper(int[][] grid, int i, int j){
        if(i<0 || i>=grid.length || j<0 || j>= grid[0].length || grid[i][j]==0)
            return 0;
        int c = grid[i][j];
        grid[i][j] = 0;
        int max1 = 0;
        int max = c;
        max1 = Math.max(helper(grid, i+1, j), max1);
        max1 = Math.max(helper(grid, i-1, j), max1);
        max1 = Math.max(helper(grid, i, j+1), max1);
        max1 = Math.max(helper(grid, i, j-1), max1);
        grid[i][j] = c;
        max += max1;
        return max;

    }


    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
