package helloAgain;

//Palindrome Partitioning memoized

public class mcm {
    static int[][] dp = new int[2001][2001];


    public int minCut(String str) {
        for(int i = 0;i< dp.length;i++){
            for(int j = 0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        return helper(str, 0, str.length()-1);

    }

    public static int helper(String s, int i, int j){
        if(i>=j)
            return 0;
        if(isP(s, i, j))
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];

        dp[i][j] = Integer.MAX_VALUE;
        for(int k = i;k<j;k++){
            if(isP(s, i, k)) {
                int solve = Math.min(dp[i][j], helper(s, i, k) + helper(s, k + 1, j) + 1);
                dp[i][j] = solve;
            }
        }
        return dp[i][j];

    }

    public static boolean isP(String s, int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }




    public static void main(String[] args){
        String s = "aab";
        System.out.println(minCut(s));
    }
}
