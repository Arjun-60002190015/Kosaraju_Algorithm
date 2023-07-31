package helloAgain;


import java.util.*;



public class Solutions {
    Integer[][] dp;
    public int minimumDeleteSum(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        dp = new Integer[m][n];
        return helper(m-1, n-1, s1, s2);
    }

    public int helper(int i, int j, String s1, String s2){
        if(i<0 && j<0) return 0;
        if(j<0) return help(s1, i);
        if(i<0) return help(s2, j);
        if(dp[i][j]!=null) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j))
            return helper(i-1, j-1, s2, s2);
        int remove1 = helper(i-1, j, s1, s2) + s1.charAt(i);
        int remove2 = helper(i, j-1, s1, s2) + s2.charAt(j);
        return dp[i][j] = Math.min(remove1, remove2);
    }

    public int help(String s, int i){
        int sum = 0;
        for(int j = 0;j<=i;j++){
            sum += s.charAt(j);
        }
        return sum;
    }



    public static void main(String[] args){
        //System.out.println(longestCommonSubsequence(new String("delete"), new String("leet")));

    }

}
