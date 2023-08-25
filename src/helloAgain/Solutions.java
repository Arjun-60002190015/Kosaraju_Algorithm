package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {
    //Recursion+Memoization

    Boolean[][] dp;
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s3.length()!=(s1.length() + s2.length())) return false;
        dp = new Boolean[s1.length()+1][s2.length()+1];
        return helper(s1, s2, s3, 0, 0);
    }

    public boolean helper(String s1, String s2, String s3, int i, int j){
        if((i+j)==s3.length()) return true;
        if(dp[i][j]!=null) return dp[i][j];
        if(i<s1.length() && s3.charAt(i+j)==s1.charAt(i)) {
            boolean flag = helper(s1, s2, s3, i + 1, j);
            dp[i][j] = flag;
            if(flag) return true;
        }
        if(j<s2.length() && s3.charAt(i+j)==s2.charAt(j)){
            boolean flag = helper(s1, s2, s3, i, j+1);
            dp[i][j] = flag;
            if(flag) return true;
        }
        return dp[i][j] = false;
    }

    //A different Solution
    public boolean isInterleaveRecursion(String s1, String s2, String s3) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        char[] c3 = s3.toCharArray();
        if(s3.length()!=(s1.length()+s2.length())) return false;
        return dfs(c1, c2, c3, 0, 0, 0, new boolean[s1.length()+1][s2.length()+1]);

    }

    public boolean dfs(char[] c1, char[] c2, char[] c3, int i, int j, int k, boolean[][] dp){
        if(dp[i][j]) return false;
        if(k==c3.length) return true;
        boolean check = i<c1.length && c1[i]==c3[k] && dfs(c1, c2, c3, i+1, j, k+1, dp) ||
                j<c2.length && c2[j]==c3[k] && dfs(c1, c2, c3, i, j+1, k+1, dp);
        if(!check) dp[i][j] = true;
        return check;
    }



    public static void main(String[] args){
        int[] nums = {4, 5, 2, 1};
        int[] quesries = {3, 10, 21};
        //System.out.println(minimumSum(27, 49));
    }

}
