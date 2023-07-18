package helloAgain;


import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {

    public int getCommon(int[] nums1, int[] nums2) {
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<nums1.length;i++){
            if(helper(nums2, nums1[i])) {
                min = Math.min(min, nums1[i]);
                break;
            }
        }
        for(int i = 0;i<nums2.length;i++){
            if(helper(nums1, nums2[i])) {
                min = Math.min(min, nums2[i]);
                break;
            }
        }
        return min==Integer.MAX_VALUE?-1:min;

    }

    public boolean helper(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(nums[mid]>target){
                end = mid-1;
            }else if(nums[mid]<target){
                start = mid+1;
            }else return true;
        }
        return false;
    }




    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
