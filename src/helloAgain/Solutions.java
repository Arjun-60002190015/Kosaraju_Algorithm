package helloAgain;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {

    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums, target), last(nums, target)};


    }

    public int first(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]==target){
                index = mid;
                end = mid - 1;
            }
            else if(nums[mid]<target){
                start = mid +1;
            }else if(nums[mid]>target){
                end = mid - 1;
            }
        }
        return index;
    }

    public int last(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]==target){
                index = mid;
                start = mid +1;
            }
            else if(nums[mid]<target){
                start = mid +1;
            }else if(nums[mid]>target){
                end = mid - 1;
            }
        }
        return index;
    }




    public static void main(String[] args){

        int[] nums = {20, 17, 15, 13, 11, 8, 7, 4, 3};
        //System.out.println(BinarySearch(nums, 3));

    }

}
