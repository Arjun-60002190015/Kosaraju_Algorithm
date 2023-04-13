package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int maxSubArray(int[] nums) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while(end< nums.length){
            if(sum<0 && nums[end]>=sum){
                start = end;
                sum = 0;
            }
            sum += nums[end];
            max = Math.max(sum, max);
            end++;
        }
        return max;

    }


    public static void main(String[] args){
        int[] nums = {10, 2};

        //System.out.println(largestNumber(nums));

    }

}
