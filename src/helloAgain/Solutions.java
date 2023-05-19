package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {

    public int robUsingRecursion(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return helper(nums,n-1, dp);
    }

    public int helper(int[] nums, int i, int[] dp){
        if(i==0)
            return nums[0];
        if(i==1)
            return Math.max(nums[0], nums[1]);
        if(dp[i]!=-1)
            return dp[i];
        return dp[i] = Math.max(helper(nums, i-1, dp), nums[i]+ helper(nums, i-2, dp));
    }






    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};

    }

}
