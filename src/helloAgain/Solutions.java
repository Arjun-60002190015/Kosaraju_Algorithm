package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    //Recursive Solution
    public String stoneGameIIIRecursive(int[] stoneValue) {
        int n = stoneValue.length;
        int diff = helperR(stoneValue, n, 0);
        if(diff>0) {
            return "Alice";
        }
        else if(diff<0){
            return "Bob";
        }
        return "Tie";

    }

    public int helperR(int[] nums, int n, int i){
        if(i==n)
            return 0;
        int res = nums[i] - helperR(nums, n, i+1);
        if(i+2 <= n){
            res = Math.max(res, nums[i]+nums[i+1] - helperR(nums, n, i+2));
        }
        if(i+3 <=n){
            res = Math.max(res, nums[i] + nums[i+1] + nums[i+2] - helperR(nums, n, i+3));
        }
        return res;
    }

    //Dp Solution

    public String stoneGameIII(int[] stoneValue) {
        int n = stoneValue.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        int diff = helper(stoneValue, dp, n, 0);
        if(diff>0){
            return "Alice";
        }else if(diff<0)
            return "Bob";
        return "Tie";

    }

    public int helper(int[] nums, int[] dp, int n, int i){
        if(i==n)
            return 0;
        if(dp[i]!=-1)
            return dp[i];
        int res = nums[i] - helper(nums, dp, n, i+1);
        if(i+1<n){
            res = Math.max(res, nums[i]+nums[i+1] - helper(nums, dp, n, i+2));

        }
        if(i+2<n){
            res = Math.max(res, nums[i]+nums[i+1]+nums[i+2] - helper(nums, dp, n, i+3));
        }
        return dp[i] = res;
    }






    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};

    }

}
