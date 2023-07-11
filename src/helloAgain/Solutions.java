package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    //Recursion
    public int findTargetSumWaysRecursion(int[] nums, int target) {
        return helper(nums, 0, 0, target);

    }

    public int helper(int[] nums, int sum, int index, int target){
        if(index== nums.length){
            if(sum==target)
                return 1;
            else return 0;
        }

        int curr = helper(nums, sum+nums[index], index+1, target);
        int cur = helper(nums, sum-nums[index], index+1, target);
        return curr+cur;
    }

    Integer[][] dp;

    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int i:nums){
            sum += i;
        }

        dp = new Integer[nums.length+1][2009];
        return memo(nums, 0, 0, target);

    }

    public int memo(int[] nums, int index, int curr, int target){
        if(index== nums.length){
            if(curr==target){
                return 1;
            }
            return 0;
        }
        if(dp[index][curr+1001]!=null)
            return dp[index][curr+1001];
        int pos = memo(nums, index+1, curr+nums[index], target);
        int neg = memo(nums, index+1, curr-nums[index], target);
        return dp[index][curr+1001] = pos+neg;

    }

    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
