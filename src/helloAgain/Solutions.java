package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    int sum;
    int max = 0;
    public int findMaxFish(int[][] grid) {
        for(int i = 0;i< grid.length;i++){
            for(int j = 0;j< grid[0].length;j++){

                if(grid[i][j]>0) {
                    sum = 0;
                    helper(i, j, grid);
                    max = Math.max(sum, max);
                }
            }
        }
        return max;

    }

    public void helper(int i, int j, int[][]grid){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j] ==0)
            return;

        sum += grid[i][j];
        grid[i][j] = 0;

        helper(i-1, j, grid);
        helper(i+1, j, grid);
        helper(i, j-1, grid);
        helper(i, j+1, grid);
    }





    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};


        //System.out.println(maxOperations(nums, 5));

    }

}
