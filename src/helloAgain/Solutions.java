package helloAgain;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {

    public static int bsNearlySorted(int[] nums, int target){
        int start = 0;
        int index = -1;
        int end = nums.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(mid - 1>start && nums[mid-1]==target){
                return mid - 1;
            }
            else if(mid + 1<= end && nums[mid+1]==target){
                return mid + 1;
            }
            else if(nums[mid]<target){
                start = mid+2;
            }
            else if(nums[mid]>target){
                end = mid - 2;
            }
        }
        return -1;
    }




    public static void main(String[] args){

        int[] nums = {5, 10, 30, 20, 40};
        System.out.println(bsNearlySorted(nums, 40));

    }

}
