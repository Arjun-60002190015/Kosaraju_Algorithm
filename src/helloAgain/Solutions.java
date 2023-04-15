package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public static long[] findPrefixScore(int[] nums) {
        long res[] = new long[nums.length];
        res[0] = nums[0] *2;
        int max = nums[0];
        for(int i = 1;i< nums.length;i++){
            if(nums[i]>max)
                max = nums[i];
            res[i] = res[i-1] + (max+nums[i]);
        }
        return res;

    }


    public static void main(String[] args){
        int[] nums = {2, 3, 7, 5, 10};

        //System.out.println(largestNumber(nums));

    }

}
