package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {
    //Not Space Optimized
    public int partitionDisjointMethod1(int[] nums) {
        int n = nums.length;
        int[] min = new int[n];
        int[] max = new int[n];
        max[0] = nums[0];
        min[n-1] = nums[n-1];
        for(int i = 1;i<n;i++){
            max[i] = Math.max(nums[i], max[i-1]);
        }
        for(int i = n-2;i>=0;i--){
            min[i] = Math.min(nums[i], min[i+1]);
        }
        int count = 0;
        for(int i = n-1;i>=0;i--){
            if(max[i]<min[i]){
                count = Math.max(count, i+1);
            }
        }
        return count;
    }

    //Space Optimized:
    public int partitionDisjoint(int[] nums) {
        int max = nums[0];
        int leftMax = nums[0];
        int n = nums.length;
        int len = 0;
        for(int i = 1;i<n;i++){
            if(nums[i]>leftMax){
                len = i+1;
                leftMax = max;
            }else{
                max = Math.max(max, nums[i]);
            }
        }
        return len;


    }




    public static void main(String[] args){
        //System.out.println(partitionString("abacaba"));

    }

}
