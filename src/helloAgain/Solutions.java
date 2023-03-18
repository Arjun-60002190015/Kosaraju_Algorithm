package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set  = new HashSet<>();
        int start = 0;
        int end = 0;
        long sum = 0;
        long max = 0;
        while(end<nums.length){
            if(!set.contains(nums[end])){
                set.add(nums[end]);
                sum += nums[end];
                if(end - start+1==k){
                    max = Math.max(max, sum);
                    sum -= nums[start];
                    set.remove(nums[start]);
                    start++;
                }
            }
            else{
                start = end;
                sum = nums[start];
                set = new HashSet<>();
                set.add(nums[end]);
            }
            end++;
        }
        return max;

    }



    public static void main(String[] args){

        int[] nums = {-5, 8, -14, 2, 4, 12};
        //System.out.println(maxSub(nums, -5));

    }

}
