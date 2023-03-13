package helloAgain;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {

    public int search(int[] nums, int target) {
        int index = findMin(nums);
        return bs(nums, 0, index, target) + bs(nums, index+1, nums.length - 1, target);


    }

    public int findMin(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start<end - 1){
            int mid = start + (end - start)/2;
            if(nums[start]<nums[mid] && nums[end] < nums[mid])
                start = mid;
            else end = mid;
        }
        return start;
    }

    public int bs(int[] nums, int start, int end, int target){
        int i = start, j = end;
        while(i <= j){
            int mid = i + (j - i) / 2;
            if(nums[mid] > target){
                j = mid - 1;
            }else if(nums[mid] < target){
                i = mid + 1;
            }
            else return mid;
        }
        return -1;

    }




    public static void main(String[] args){

        int[] nums = {3, 4, 5, 1, 2};
        //System.out.println(findMin(nums));

    }

}
