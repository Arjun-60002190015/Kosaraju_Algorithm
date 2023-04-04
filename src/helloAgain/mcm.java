package helloAgain;

//Palindrome Partitioning memoized

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class mcm {
    public static int twoEggDrop(int n) {
        int[][] dp = new int[3][n+1];
        for(int[] i:dp){
            Arrays.fill(i, -1);
        }
        return helper(2, n, dp);

    }
    public static int helper(int k, int n, int[][] dp){
        if(n==0 || n==1 || k==1)
            return n;
        if(dp[k][n]!=-1)
            return dp[k][n];
        int min = Integer.MAX_VALUE;
        for(int i = 1;i<=n;i++){
            int temp = 1 + Math.max(helper(k-1, i-1, dp), helper(k, n-i, dp));
            min = Math.min(min, temp);
        }
        return dp[k][n] = min;
    }

    public  static int f(int eggs,int floors,int[][] memo) {
        if(floors == 0 || floors == 1) return floors;
        if(eggs == 1) return floors;

        int ans = Integer.MAX_VALUE;
        if(memo[eggs][floors] != -1) return memo[eggs][floors];

        for(int i = 1;i<=floors;i++) {
            int min = Math.max(f(eggs-1,i-1,memo),f(eggs,floors-i,memo));
            if(min < ans) ans = min;
        }

        return memo[eggs][floors] = ans+1;
    }
    public static int twoEggDropw(int n) {
        int floors = n;
        int eggs = 2;
        int[][] memo = new int[eggs+1][floors+1];
        for(int[] arr: memo) Arrays.fill(arr,-1);
        return f(eggs,floors,memo);
    }


    public static void main(String[] args){
        String s = "aab";
        System.out.println(twoEggDropw(100));
    }
}
