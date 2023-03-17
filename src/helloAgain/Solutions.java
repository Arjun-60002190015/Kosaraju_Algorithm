package helloAgain;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public static int maxSub(int[] nums, int target){
        int start = 0;
        int end = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while(end< nums.length){
            sum += nums[end++];
            while(sum==target){
                max = Math.max(max, end - start);
                sum -= nums[start++];

            }
        }
        return max;
    }



    public static void main(String[] args){

        int[] nums = {-5, 8, -14, 2, 4, 12};
        System.out.println(maxSub(nums, -5));

    }

}
