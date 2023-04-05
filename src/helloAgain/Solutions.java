package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public static boolean searchMatrix(int[][] matrix, int target) {

        int i = 0;
        int j = matrix[0].length-1;
        while(i< matrix.length && j>=0){
            if(matrix[i][j]==target)
                return true;
            if(matrix[i][j]<target){
                i++;
            }
            else {
                j--;
            }

        }
        return false;


    }




    public static void main(String[] args){
        int[] nums = {5, 8, 6};
        int target = 4;

        //System.out.println(maximumCandies(nums, 3));

    }

}
