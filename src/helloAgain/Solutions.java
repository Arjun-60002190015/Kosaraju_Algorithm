package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int start = 0;
        int end = k-1;
        int min = Integer.MAX_VALUE;
        while(end<nums.length){
            min = Math.min(min, nums[end] - nums[start]);
            start++;
            end++;
        }
        return min;

    }


    public static void main(String[] args){

        int[] nums = {-5, 8, -14, 2, 4, 12};
        //System.out.println(maxSub(nums, -5));

    }

}
