package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int diagonalPrime(int[][] nums) {
        int max = 0;
        for(int i = 0;i< nums.length;i++){
            if(prime(nums[i][i]))
                max = Math.max(max, nums[i][i]);
            if(prime(nums[nums.length-1-i][i]))
                max = Math.max(max, nums[nums.length-1-i][i]);
        }
        return max;


    }

    public boolean prime(int n){
        if(n<2)
            return false;
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }




    public static void main(String[] args){
        int[] nums = {10, 2};

        //System.out.println(largestNumber(nums));

    }

}
