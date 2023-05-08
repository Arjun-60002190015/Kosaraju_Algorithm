package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {

    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i = 0;i<n;i++){

                sum += mat[i][i] + mat[i][n-i-1];

        }
        if(n%2!=0)
            sum = sum - mat[n/2][n/2];

        return sum;

    }







    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};


        //System.out.println(maxOperations(nums, 5));

    }

}
