package helloAgain;


import java.util.*;



public class Solutions {
    public int minExtraChar(String s, String[] dictionary) {
        Integer[] dp = new Integer[s.length()+1];
        Set<String> set = new HashSet<>();
        for(String j:dictionary) set.add(j);
        return helper(s, set, 0, dp);
        //return s.length()-taken;
    }

    public int helper(String s, Set<String> set, int index, Integer[] dp){
        if(index==s.length()) return 0;
        if(dp[index]!=null) return dp[index];
        int min = Integer.MAX_VALUE;
        for(int i = index+1;i<=s.length();i++){
            if(set.contains(s.substring(index, i))){
                min = Math.min(min, 0 + helper(s, set, i, dp));
            }else{
                min = Math.min(min, i-index+ helper(s, set, i, dp));
            }
        }
        return dp[index] = min;
    }


    public static void main(String[] args){
        //System.out.println(pivotInteger(8));

    }

}
