package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    Integer[][] dp;

    public int maxValueOfCoins(List<List<Integer>> piles, int k) {
        int n = piles.size();
        dp = new Integer[n+1][k+1];
        return helper(piles, n-1, k);

    }

    public int helper(List<List<Integer>> piles, int curr, int left){
        if(curr<0 || left==0)
            return 0;
        if(dp[curr][left]!=null)
            return dp[curr][left];
        int limit = Math.max(left, piles.get(curr).size());

        int dontTake = helper(piles, curr - 1, left);

        int Take = 0;
        for(int j = 0, sum = 0;j<limit;j++){
            sum += piles.get(curr).get(j);
            Take = Math.max(sum + helper(piles, curr-1, left - (j+1)), Take);
        }

        int res = Math.max(Take, dontTake);
        dp[curr][left] = res;
        return res;
    }


    public static void main(String[] args){
        int[] nums = {10, 2};

        //System.out.println(largestNumber(nums));

    }

}
