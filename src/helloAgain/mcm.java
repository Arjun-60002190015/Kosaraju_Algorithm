package helloAgain;

//Palindrome Partitioning memoized

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class mcm {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] res = new int[2];
        int index = 0;
        int max = 0;
        for(int i = 0;i< mat.length;i++){
            int ones = 0;
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    ones++;
                }
            }
            if(ones>max){
                max = ones;
                index = i;
            }
        }
        res[0] = index;
        res[1] = max;
        return res;
    }



    public static void main(String[] args){
        String a = "aaa";
        //System.out.println(addMinimum(a));
    }
}
