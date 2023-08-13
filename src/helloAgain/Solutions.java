package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {
    //Recursion
    public boolean validPartitionRecursion(int[] nums) {

        return helper(nums, 0);
    }

    public boolean helper(int[] nums, int index){
        if(index>= nums.length) return true;
        if(index<= nums.length-3 && nums[index]==nums[index+1] && nums[index]==nums[index+2]){
            return helper(nums, index+2) || helper(nums, index+3);
        }
        if(index<=nums.length-2 && nums[index]==nums[index+1])
            return helper(nums, index+2);
        if(index<= nums.length-3){
            if(nums[index]==nums[index+1]-1 && nums[index]==nums[index+2]-2)
                return helper(nums, index+3);
        }
        return false;
    }

    //Memoization

    public boolean validPartition(int[] nums) {
        Boolean[] dp = new Boolean[nums.length];
        return helper1(nums, 0, dp);
    }
    public boolean helper1(int[] nums, int i, Boolean[] dp){

        if(i>= nums.length) return true;
        if(dp[i]!=null) return dp[i];
        if(i<= nums.length-3 && nums[i]==nums[i+1] && nums[i]==nums[i+2]){
            return dp[i] = helper1(nums, i+2, dp) || helper1(nums, i+3, dp);
        }
        if(i<=nums.length-2 && nums[i]==nums[i+1]){
            return dp[i] = helper1(nums, i+2, dp);
        }
        if(i<= nums.length-3){
            if(nums[i]==nums[i+1]-1 && nums[i]==nums[i+2]-2){
                return dp[i] = helper1(nums, i+3, dp);
            }
        }
        return dp[i] = false;
    }


    public static void main(String[] args){
        int[] nums = {4, 5, 2, 1};
        int[] quesries = {3, 10, 21};
        //System.out.println()
    }

}
