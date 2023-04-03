package helloAgain;

//Palindrome Partitioning memoized

import java.util.Arrays;

public class mcm {
    static int[][] memo ;
    public static int superEggDrop(int k, int n) {
        memo = new int[k+1][n+1];
        for(int[] d:memo){
            Arrays.fill(d, (int)1e9);
        }
        return memoize(k, n);


    }

    public static int memoize(int eggs, int floors){
        if(eggs==1)
            return floors;
        if(floors==0 || floors==1)
            return floors;
        if(memo[eggs][floors]!=(int)1e9)
            return memo[eggs][floors];
        int min = (int)1e9;
        for(int floor = 1;floor<=floors;floor++){
            int temp = 1 + Math.max(memoize(eggs - 1, floor-1), memoize(eggs, floors - floor));
            min = Math.min(min, temp);
        }
        return memo[eggs][floors]= min;

    }





    public static void main(String[] args){
        String s = "aab";
        //System.out.println(minCut(s));
    }
}
