package helloAgain;

import com.sun.deploy.security.CredentialManager;
import com.sun.prism.shader.AlphaOne_Color_AlphaTest_Loader;
import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {

    public int orderOfLargestPlusSign(int n, int[][] mines) {
        int[][] grid = new int[n][n];
        for(int i =0 ;i<n;i++){
            for(int j = 0;j<n;j++){
                grid[i][j] = 1;
            }
        }
        for(int[] i:mines){
            grid[i[0]][i[1]] = 0;
        }
        int max = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j]==1){
                    max = Math.max(max, helper(grid, i, j));
                }
            }
        }
        return max;
    }

    public int helper(int[][] grid, int i, int j){

        int order = 0;
        int left = 0, right = 0, up = 0, down = 0;
        while(i-left>=0 && grid[i-left][j]==1){
            left++;
        }
        while(i+ right<grid.length && grid[i+right][j]==1){
            right++;
        }
        while(j-up>=0 && grid[i][j-up]==1)
            up++;
        while(j+down<grid.length && grid[i][j+down]==1){
            down++;
        }
        return order = Math.min(down, Math.min(up, Math.min(left, right)));

    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
