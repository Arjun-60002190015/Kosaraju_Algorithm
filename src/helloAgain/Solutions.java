package helloAgain;


import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int start = matrix[0][0];
        int end = matrix[n-1][n-1];
        while(start<end){
            int mid = start + (end-start)/2;
            int count=  helper(matrix, mid);
            if(count<k){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;

    }

    public int helper(int[][] matrix, int mid){
        int j = 0;
        int len = matrix.length;
        int i = len-1;
        int count = 0;
        while(j<len && i>=0){
            if(matrix[i][j]>mid){
                i--;
            }else{
                count += i+1;
                j++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
