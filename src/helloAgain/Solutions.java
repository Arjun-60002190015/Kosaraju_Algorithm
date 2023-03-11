package helloAgain;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {

    public int kthSmallestBruteForce(int[][] matrix, int k) {
        int n = matrix.length;
        int index = 0;
        int[] arr = new int[n*n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                arr[index] = matrix[i][j];
                index++;
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }

    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int min = matrix[0][0];
        int max = matrix[n-1][n-1];
        while(min!=max){
            int mid = min - (max - min)/2;
            int count = helper(matrix, min);
            if(count<k){
                min = mid + 1;
            }else{
                max = mid;
            }
        }
        return min;

    }

    public int helper(int[][] matrix, int mid){
        int count = 0;
        int row = 0;
        int col = matrix.length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col]<=mid){
                count += col +1;
                row++;
            }else{
                col--;
            }
        }
        return count;
    }









        public static void main(String[] args){
        char[] c = {'c', 'f', 'j'};
        int n = 5;
        //System.out.println(nextGreatestLetter(c, 'a'));

    }

}
