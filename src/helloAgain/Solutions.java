package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int start = 0;
        int n = nums.length;
        int end = nums[n-1]-nums[0];
        int ans = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(helper(mid, nums, p)){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;

    }

    // Take care of distinct pairs - indices should not be repeated

    public boolean helper(int diff, int[] nums, int p){
        int count= 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]-nums[i-1]<=diff){
                count++;
                i++;
            }
        }
        return count>=p;
    }





}
