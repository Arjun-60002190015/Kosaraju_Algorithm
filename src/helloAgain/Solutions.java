package helloAgain;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {

    public static int findCount(int[] nums, int target) {
        return last(nums, target) - first(nums, target) +1;


    }

    public static int first(int[] nums, int target){
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

    public static int last(int[] nums, int target){
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

        int[] nums = {2, 4, 10, 10, 10, 18, 20};
        System.out.println(findCount(nums, 10));

    }

}
