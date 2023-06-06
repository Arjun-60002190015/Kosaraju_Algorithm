package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    long prod;
    public long maxStrength(int[] nums) {
        prod = Integer.MIN_VALUE;
        helper(nums, 0, 1, 0);
        return prod;

    }

    public void helper(int[] nums, int index, long product, int size){
        if(index>= nums.length){
            if(size!=0) prod = Math.max(prod, product);
            return;
        }

        helper(nums, index+1, product*nums[index], size+1);
        helper(nums, index+1, product, size);
    }


    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
