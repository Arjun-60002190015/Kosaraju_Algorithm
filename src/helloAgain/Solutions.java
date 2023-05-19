package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {

    public int rob(int[] nums) {
        int[] dp1 = new int[nums.length];
        Arrays.fill(dp1, -1);
        dp1[0] = nums[1];

        int[] dp2 = new int[nums.length];
        Arrays.fill(dp2, -1);
        dp2[0] = nums[0];
        return Math.max(helper(nums, 1, nums.length-1, dp1), helper(nums, 0, nums.length-2, dp2));

    }

    public int helper(int[] nums, int start, int i, int[] dp){
        if(i<start)
            return 0;
        if(i==start)
            return nums[start];
        if(dp[i]!=-1)
            return dp[i];
        return dp[i] = Math.max(helper(nums, start, i-1, dp), nums[i] + helper(nums, start, i-2, dp));
    }






    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};

    }

}
