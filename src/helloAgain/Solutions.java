package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] res = new int[2];
        int index = -1;
        int ones = 0;
        int max = Integer.MIN_VALUE;
        for(int i = mat.length-1;i>=0;i--){
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    ones++;

                }
            }
            max = Math.max(ones, max);


            ones = 0;

        }
        res[0] = index;
        res[1] = max;
        return res;



    }


    public static void main(String[] args){
        int[] nums = {2, 3, 7, 5, 10};

        //System.out.println(largestNumber(nums));

    }

}
