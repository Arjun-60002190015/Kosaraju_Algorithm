package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {
    public int uniquePathsIII(int[][] grid) {
        //Integer[][] dp = new Integer[grid.length][grid[0].length];
        int count = 0;
        int x = -1;
        int y = -1;
        int zeroes = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    zeroes++;
                }
                if(grid[i][j]==1){
                    x = i;y = j;
                }
            }
        }
        count += helper(x, y, grid, zeroes);
        return count;
    }

    public int helper(int i, int j, int[][] grid, int k){
        if(i<0 || j<0 || i>= grid.length || j>=grid[0].length || grid[i][j]==-1)
            return 0;
        if(grid[i][j]==2) return k==-1?1:0;
        grid[i][j] = -1;
        k--;
        int path = helper(i+1, j, grid, k)+
                helper(i, j+1, grid, k)+
                helper(i-1, j, grid, k)+
                helper(i, j-1, grid, k);

        grid[i][j] = 0;
        k++;
        return path;
    }



    public static void main(String[] args){
        int[] nums = {4, 5, 2, 1};
        int[] quesries = {3, 10, 21};
        //System.out.println()
    }

}
