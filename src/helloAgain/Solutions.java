package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    //Recursive Solution

    public int stoneGameIIRecursive(int[] piles) {
        int n = piles.length;
        int[] prefix = new int[n];
        prefix[n-1] = piles[n-1];
        for(int i = n-2;i>=0;i--){
            prefix[i] = piles[i] + prefix[i+1];
        }


        return helper(piles, prefix, 0, 1);

    }

    public int helperR(int[] piles, int[] prefix, int i, int M) {
        if (i == piles.length)
            return 0;

        if(2*M>= piles.length-i){
            return prefix[i];
        }


        int max = 0;
        for(int j = 1;j<=2*M;j++){
            int rem = prefix[i] - helperR(piles, prefix, i+j, Math.max(M, j));
            max = Math.max(max, rem);
        }
        return  max;
    }

    //Memoized Solution
    int[][] memo;
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[] prefix = new int[n];
        prefix[n-1] = piles[n-1];
        for(int i = n-2;i>=0;i--){
            prefix[i] = piles[i] + prefix[i+1];
        }

        memo = new int[n][n];
        for(int[] mem:memo){
            Arrays.fill(mem, -1);
        }
        return helper(piles, prefix, 0, 1);

    }

    public int helper(int[] piles, int[] prefix, int i, int M) {
        if (i >= piles.length)
            return 0;

        if(2*M>= piles.length-i){
            return prefix[i];
        }
        if(memo[i][M]!=-1)
            return memo[i][M];

        int max = 0;
        for(int j = 1;j<=2;j++){
            int rem = prefix[i] - helper(piles, prefix, i+j, Math.max(M, j));
            max = Math.max(max, rem);
        }
        return memo[i][M] = max;
    }






    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};

    }

}
