package helloAgain;

import com.sun.deploy.security.CredentialManager;
import com.sun.prism.shader.AlphaOne_Color_AlphaTest_Loader;
import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    //Recursion and Memoization
    int max = 0;
    Integer[][] dp;
    public int maximalSquareR(char[][] matrix) {


        int m = matrix.length;
        int n = matrix[0].length;
        dp = new Integer[m+1][n+1];

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j]=='1'){
                    helper(matrix, i, j);

                }
            }
        }
        return max*max;
    }

    public int helper(char[][] matrix, int i, int j){
        if(i<0 || i>= matrix.length || j<0 || j>=matrix[0].length || matrix[i][j]=='0')
            return 0;
        int ans = 0;
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        ans =  1 + Math.min(helper(matrix, i+1, j), Math.min(helper(matrix, i, j+1), helper(matrix, i+1, j+1)));
        max = Math.max(ans, max);
        return dp[i][j] = ans;
    }
    //DP
    public int maximalSquare(char[][] matrix) {
        int n = matrix[0].length;
        int m = matrix.length;
        int max = 0;
        int[][] dp = new int[m+1][n+1];
        for(int i = 0;i<=m;i++){
            for(int j = 0;j<=n;j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
            }
        }
        for(int i = 1;i<=m;i++){
            for(int j = 1;j<=n;j++){
                if(matrix[i-1][j-1]=='1'){
                    dp[i][j] = 1+ Math.min(dp[i-1][j], Math.min(dp[i-1][j-1], dp[i][j-1]));
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max*max;

    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
