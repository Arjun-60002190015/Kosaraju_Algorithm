package helloAgain;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    int m;
    int n;


    public int numIslands(char[][] grid) {
        int count = 0;
        m = grid.length;
        n = grid[0].length;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j]=='1'){
                    helper(grid, i, j);
                    count++;
                }
            }
        }
        return count;


    }

    public void  helper(char[][] grid, int i, int j){
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j]!='1')
            return;
        grid[i][j] = '0';
        helper(grid, i+1, j);
        helper(grid, i, j+1);
        helper(grid, i, j - 1);
        helper(grid, i-1, j);
    }





    public static void main(String[] args){

        int[] nums = {5, 10, 30, 20, 40};
        //System.out.println(nthUglyNumber(7));

    }

}
