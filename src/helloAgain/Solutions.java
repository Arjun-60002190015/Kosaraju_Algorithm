package helloAgain;

import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    Integer[][] dp;
    public int lengthOfLIS(int[] nums) {
        dp = new Integer[nums.length][nums.length];
        return helper(nums, 0, -1);
    }

    public int helper(int[] nums, int i, int prev){
        if(i== nums.length)
            return 0;
        if(prev>-1 && dp[i][prev]!=null)
            return dp[i][prev];
        int pick = nums[i]>(prev==-1?Integer.MIN_VALUE:nums[prev])? 1+helper(nums, i+1, i):0;
        int not = helper(nums, i+1, prev);
        if(prev!=-1){
            return dp[i][prev] = Math.max(pick, not);
        }
        return Math.max(pick, not);
    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
