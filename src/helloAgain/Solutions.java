package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {
    public int minimizedMaximum(int n, int[] quantities) {
    int start = 0;
    int max = 0;
    int sum = 0;
    Arrays.sort(quantities);
    for(int i:quantities){
        max = Math.max(max, i);
        sum += i;
    }
    int ans = 0;
    int end = max;
    while(start<=end){
        int mid = start + (end-start)/2;
        if(helper(quantities, mid, n)){
            ans = mid;
            end = mid-1;
        }
        else start = mid+1;
    }
    return ans;

}

    public boolean helper(int[] nums, int mid, int n){
        for(int i = 0;i<nums.length;i++){
            int prod = nums[i];
            n -= Math.ceil(prod/(mid*1.0));
            if(n<0)     // means it requires more than n shops to distribute all products
                return false;

        }
        return true;
    }

}
