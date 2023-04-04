package helloAgain;

//Palindrome Partitioning memoized

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class mcm {
    static int[][] dp;
    public int superEggDrop(int k, int n) {
        dp = new int[k+1][n+1];
        for(int[] d:dp){
            Arrays.fill(d, (int)1e9);
        }
        return helper(k, n);
    }

    public static int helper(int k, int n){
        if(n==0 || n==1)
            return n;
        if(k==1)
            return n;
        if(k==0)
            return 0;
        if(dp[k][n]!=(int)1e9)
            return dp[k][n];
        int low = 1;
        int high = n;
        int min = (int)1e9;
        while(low<=high){
            int mid = low + (high - low)/2;
            int temp = 1 + Math.max(helper(k-1, mid - 1), helper(k, n - mid));
            min = Math.min(min, temp);
            if(helper(k-1, mid - 1)<helper(k, n - mid)){
                low = mid+1;
            }else{
                high = mid - 1;
            }
        }
        return dp[k][n] = min;
    }


    public static void main(String[] args){
        String s = "aab";
        //System.out.println(minCut(s));
    }
}
