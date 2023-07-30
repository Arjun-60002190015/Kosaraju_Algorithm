package helloAgain;


import java.util.*;



public class Solutions {
    public static String longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        for(int i = 0;i<text1.length();i++){
            for(int j = 0;j<text2.length();j++){
                if(text1.charAt(i)==text2.charAt(j)){
                    dp[i+1][j+1] = 1 + dp[i][j];
                }else{
                    dp[i+1][j+1] = Math.max(dp[i+1][j], dp[i][j+1]);
                }
            }
        }
        StringBuilder res = new StringBuilder();
        int i = text1.length();
        int j = text2.length();
        while(i>0 && j>0){
            if(text1.charAt(i-1)==text2.charAt(j-1)){
                res.append(text1.charAt(i-1));
                i--;
                j--;
            }
            else{
                if(dp[i][j-1]>dp[i-1][j]){
                    j--;
                }else{
                    i--;
                }
            }
        }
        return res.reverse().toString();
    }



    public static void main(String[] args){
        System.out.println(longestCommonSubsequence(new String("bca"), new String("aaa")));

    }

}
