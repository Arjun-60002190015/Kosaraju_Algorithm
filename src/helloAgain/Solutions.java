package helloAgain;

import java.util.*;



public class Solutions {


    public int maximumCount(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int zeroes = 0;
        while(start<end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == 0){
                zeroes++;
                start = mid = 1;
            }
            if(nums[mid]>0){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return Math.max(start - zeroes, nums.length - start);
    }


    public static void main(String[] args){
        int[] arr = {1,5,2, 4, 1};
        //System.out.println((arr));

    }

}
