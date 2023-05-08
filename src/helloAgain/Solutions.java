package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {

    public int minSteps(int n) {
        dp = new Integer[n][n];
        return helper1(n, 1, 0);


    }
    Integer[][] dp;

    public int helper1(int n, int curr, int copy){
        if(curr==n)
            return 0;
        if(dp[curr][copy]!=null)
            return dp[curr][copy];

        int min = Integer.MAX_VALUE-1;
        if(curr+copy<=n && copy!=0)
            min = Math.min(min, helper1(n, curr+copy, copy)+1) ;
        if(curr>copy)
            min = Math.min(min, helper1(n, curr, curr)+1);

        dp[curr][copy] = min;
        return min;
    }


    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};


        //System.out.println(maxOperations(nums, 5));

    }

}
