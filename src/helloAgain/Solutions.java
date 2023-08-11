package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {
    int mod = (int)1e9+7;
    Integer[][] dp;
    public int numRollsToTarget(int n, int k, int target) {
        dp = new Integer[n+1][target+1];
        return helper(n, k, target);

    }

    public int helper(int n, int k, int target){
        if(target<1) return 0;
        if(n==1){
            if(target<=k) return 1;
            else return 0;
        }
        if(dp[n][target]!=null) return dp[n][target];
        int num = 0;
        for(int i = 1;i<=k;i++){
            num = (num + helper(n-1, k, target-i))%mod;
        }
        return dp[n][target] = num;
    }


    public static void main(String[] args){
        int[] nums = {4, 5, 2, 1};
        int[] quesries = {3, 10, 21};
        //System.out.println()
    }

}
