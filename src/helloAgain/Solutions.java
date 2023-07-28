package helloAgain;


import javafx.scene.layout.Priority;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.sql.Array;
import java.util.*;



public class Solutions {
    int max = 0;
    public int findMaxFish(int[][] grid) {
        for(int i = 0;i< grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    max = Math.max(max, helper(i, j, grid));
                }

            }
        }
        return max;
    }

    public int helper(int i, int j, int[][] grid){
        if(i<0 || j<0 || i>= grid.length || j>=grid[0].length || grid[i][j]==0){
            return 0;
        }
        int curr = grid[i][j];
        grid[i][j] = 0;

        int up = helper(i+1, j, grid);
        int down = helper(i-1, j, grid);
        int right = helper(i, j+1, grid);
        int left = helper(i, j-1, grid);
        return curr + up+ down+left+right;


    }

    public static void main(String[] args){

        //System.out.println(checkPossibility(new int[]{3, 4, 2, 3}));
    }

}
