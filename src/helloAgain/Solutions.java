package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {

    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];
        for(int i = 0;i<=n;i++){
            dp[i][0] = 1;
        }
        for(int j = 0;j<=amount;j++){
            dp[0][j] = 0;
        }
        for(int i= 1;i<=n;i++){
            for(int j = 1;j<=amount;j++){
                if(coins[i-1]>j){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j] + dp[i][j - coins[i-1]];
                }
            }
        }
        return dp[n][amount];

    }


    public static void main(String[] args){
        int[] nums = {10, 2};

        //System.out.println(largestNumber(nums));

    }

}
