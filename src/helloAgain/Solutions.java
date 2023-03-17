package helloAgain;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public static int minimum(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]>target){
                end = mid - 1;
            }else if(nums[mid]<target){
                start = mid + 1;
            }else return 0;
        }
        return Math.min(Math.abs(nums[start] - target), Math.abs(nums[end] - target));

    }


    public static void main(String[] args){

        int[] nums = {1, 3, 8, 10, 15};
        System.out.println(minimum(nums, 12));

    }

}
