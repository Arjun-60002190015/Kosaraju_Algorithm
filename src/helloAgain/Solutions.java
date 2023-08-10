package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {
    public int minDifference(int[] nums) {
        int n = nums.length;
        if(n<=4) return 0;
        Arrays.sort(nums);
        //return Math.min(nums[n-1]-nums[0], Math.min(nums[n-2] - nums[]))
        int one = nums[n-4]-nums[0];
        int two = nums[n-3] - nums[1];
        int three = nums[n-2] - nums[2];
        int four = nums[n-1] - nums[3];
        return Math.min(one, Math.min(two, Math.min(three, four)));

    }





}
