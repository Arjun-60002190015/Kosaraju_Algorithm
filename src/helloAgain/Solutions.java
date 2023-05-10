package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int left = 0;
        int top =0;
        int right = n-1;
        int bottom = n-1;
        int count=  0;
        while(left<=right){
            for(int j = left;j<=right;j++){
                res[top][j] = count++;
            }
            top++;
            for(int i = top;i<=bottom;i++){
                res[i][right] = count++;
            }
            right--;
            for(int j = right;j>=left;j--){
                res[bottom][j] = count++;
            }
            bottom--;

            for(int i = bottom;i>=top;i--){
                res[i][left] = count++;
            }
            left++;
        }
        return res;

    }


    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};

    }

}
