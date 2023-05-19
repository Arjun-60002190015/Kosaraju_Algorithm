package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {

    //Recursion solution

    public long mostPointsUsingRecursion(int[][] questions) {
        return helper(0, questions);
    }

    public long helper(int index, int[][] questions){
        if(index== questions.length)
            return 0;
        if(questions[index][1] + index+1> questions.length){
            return Math.max(questions[index][0], helper(index+1, questions));
        }else{
            return Math.max(helper(index+1, questions), questions[index][0] + helper(index + questions[index][1] + 1, questions));
        }
    }
    //Using DP

    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n+1];
        dp[n] = 0;
        for(int i = n-1;i>=0;i--){
            if(questions[i][1]+i+1>n){
                dp[i] = Math.max(dp[i+1], questions[i][0]);
            }else dp[i] = Math.max(dp[i+1], questions[i][0]+dp[questions[i][1]+i+1]);
        }
        return dp[0];

    }




    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};

    }

}
