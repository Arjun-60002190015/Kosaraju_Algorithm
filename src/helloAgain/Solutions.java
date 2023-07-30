package helloAgain;


import java.util.*;



public class Solutions {
    Integer[][] dp;
    int max = 1;
    public int longestIncreasingPath(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        dp = new Integer[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                int path =
                        helper(matrix, i, j, -1);
                max = Math.max(max, path);
            }
        }
        return max;

    }

    public int helper(int[][] matrix, int i, int j, int prev){
        if(i<0 || i>= matrix.length || j<0 || j>= matrix[0].length || matrix[i][j]<=prev)
            return 0;
        if(dp[i][j]!=null) return dp[i][j];
        int max = 1;
        int up = 1+
                helper(matrix, i-1, j, matrix[i][j]);
        int down = 1+
                helper(matrix, i+1, j, matrix[i][j]);

        int left =  1+helper(matrix, i, j-1,matrix[i][j]);
        int right = 1+
                helper(matrix, i, j+1, matrix[i][j]);
        return dp[i][j] = Math.max(max,Math.max(up, Math.max(down, Math.max(left, right))));

    }



    public static void main(String[] args){
        /*
        Scanner sc = new Scanner(System.in);
        int res = 0;
        int t = sc.nextInt();
        for(int i = 0;i<t;i++){
            long n = sc.nextLong();
            //System.out.println(helper(n));
            }

         */

    }

}
