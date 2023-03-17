package helloAgain;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        while(end< nums.length){
            sum += nums[end];
            end++;
            while(sum>=target){
                min = Math.min(min, end - start);
                sum -= nums[start];
                start++;
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }



        public static void main(String[] args){

        int[] nums = {1, 3, 8, 10, 15};
        //System.out.println(minimum(nums, 12));

    }

}
