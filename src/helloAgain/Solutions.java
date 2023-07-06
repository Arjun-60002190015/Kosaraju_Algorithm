package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    //Recursion Solution -
    int max = 0;

    public int maxProductRecursion(String s) {
        char[] c = s.toCharArray();
        helper(c, 0, "", "");
        return max;
    }

    public void helper(char[] c, int i, String s1, String s2){
        if(i>=c.length){
            if(isPalin(s1) && isPalin(s2)){
                max = Math.max(max, s1.length()*s2.length());
                return;
            }
        }

        helper(c, i+1, s1+c[i], s2);
        helper(c, i+1, s1, s2+c[i]);
        helper(c, i+1, s1, s2);
    }

    public boolean isPalin(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    //Memoization -
    int ans = 0;

    Integer[][] dp;

    public int maxProduct(String s) {
        dp = new Integer[s.length()+1][s.length()+1];
        char[] c = s.toCharArray();
        helperM(0, c, "", "");
        return ans;

    }

    public int helperM(int i, char[] c, String s1, String s2){

        if(isPalin(s1) && isPalin(s2)){
                ans = Math.max(ans, s1.length()*s2.length());
        }

        if(i>=c.length){
            return dp[s1.length()][s2.length()];
        }

        dp[s1.length()][s2.length()] = ans;
        int one = helperM(i+1, c, s1+c[i], s2);
        int two = helperM(i+1, c, s1, s2+c[i]);
        int three = helperM(i+1, c, s1, s2);
        return dp[s1.length()][s2.length()];

    }




    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
