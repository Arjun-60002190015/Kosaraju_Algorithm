package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public static int bs(int target, int[] nums) {
        int PeakIndex = getPeak(nums);
        int Lindex = bslow(0, PeakIndex, nums,  target);
        int Hindex = bshigh(PeakIndex+1, nums.length-1, nums, target);

        if(Lindex==-1 && Hindex==-1)
            return -1;
        if(Lindex==-1)
            return Hindex;
        return Lindex;



    }

    public static int getPeak(int[] nums){
        int low = 0;
        int high = nums.length-1;
        while(low<high){
            int mid = low + (high - low)/2;
            if(nums[mid]<nums[mid+1]){
                low = mid+1;
            }else if(nums[mid]>nums[mid+1]){
                high = mid;
            }
        }
        return low;
    }

    public static int bslow(int low, int high, int[] nums, int key){
        int index = -1;
        while(low<high){
            int mid = low + (high - low)/2;
            if(nums[mid]<key){
                low = mid+1;
            }else if(nums[mid]>key){
                high = mid;
            }else index = mid;
        }
        return index;
    }

    public static int bshigh(int high, int low, int[] nums, int key){
        int index = -1;
        while(high<low){
            int mid = high + (low - high)/2;
            if(nums[mid]<key){
                high = mid+1;
            }else if(nums[mid]>key){
                low = mid;
            }else index = mid;
        }
        return index;
    }


    public static void main(String[] args){
        int[] nums = {1, 3, 8, 12, 4, 2};
        int target = 4;

        System.out.println(bs(target, nums));

    }

}
