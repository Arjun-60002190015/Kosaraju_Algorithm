package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {

    public boolean checkXMatrix(int[][] grid) {
        boolean[][] grid1 = new boolean[grid.length][grid[0].length];
        int n = grid.length;
        for(int i = 0;i< grid.length;i++){
            if(grid[i][i]==0 || grid[i][n-i-1]==0) {
                return false;
            }


        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i==j || j==(n-i-1))
                    continue;
                else if(grid[i][j]!=0)
                    return false;

            }
        }
        return true;

    }







    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};


        //System.out.println(maxOperations(nums, 5));

    }

}
