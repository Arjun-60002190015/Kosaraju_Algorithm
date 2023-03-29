package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {


    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int n = satisfaction.length;
        int[][] dp = new int[n+1][n+1];
        for(int[] row:dp){
            Arrays.fill(row, Integer.MIN_VALUE);
        }
        return helper(satisfaction, 0, 1, dp);
    }

    public int helper(int[] nums, int index, int time, int[][] dp){
        if(index==nums.length)
            return 0;
        if(dp[index][time]!=Integer.MIN_VALUE){
            return dp[index][time];
        }
        int dont = helper(nums, index+1, time, dp);
        int take = helper(nums, index+1, time+1, dp) + nums[index] * time;
        return dp[index][time] = Math.max(dont, take);
    }


    public static void main(String[] args){
        int[] nums = {-1, -8, 0, 5, -9};
        //System.out.println(maxSatisfaction(nums));

    }

}
