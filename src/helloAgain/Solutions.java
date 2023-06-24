package helloAgain;

import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    //Recursion -
    public int tallestBillboardRecursion(int[] rods) {
        return helpero(rods, 0, 0, 0);

    }

    public int helpero(int[] rods, int one, int two, int index){
        if(index== rods.length){
            if(one==two)
                return one;
            return 0;
        }
        int not = helper(rods, one, two, index+1);
        int pick = helper(rods, one+rods[index], two, index+1);
        int pi = helper(rods, one, two+rods[index], index+1);
        return Math.max(not, Math.max(pick,pi));
    }

    //Memoization

    public int tallestBillboard(int[] rods) {
        Integer[][] dp = new Integer[rods.length+1][10001];
        int res = helper(rods, 0, 0, dp);
        return res<0?0:res;

    }

    public int helper(int[] rods, int index, int sum, Integer[][] dp){
        if(index==rods.length){
            if(sum==0){
                return 0;
            }
            return Integer.MIN_VALUE;
        }
        if(dp[index][sum+5000]!=null){
            return dp[index][sum+5000];
        }
        int not = helper(rods, index+1, sum, dp);
        int pick = helper(rods, index+1, sum + rods[index], dp)+ rods[index];
        int pi = helper(rods, index+1, sum - rods[index], dp);
        return dp[index][sum+5000] = Math.max(not, Math.max(pick, pi));

    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
