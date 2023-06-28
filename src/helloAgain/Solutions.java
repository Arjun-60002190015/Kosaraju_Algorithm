package helloAgain;

import com.sun.deploy.security.CredentialManager;
import com.sun.prism.shader.AlphaOne_Color_AlphaTest_Loader;
import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int maximalRectangle(char[][] matrix) {
        int max = 0;
        int[][] dp = new int[matrix.length+1][matrix[0].length+1];
        for(int i = 0;i< matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j]==0)
                    dp[i][j] = 0;
                else if(matrix[i][j]=='1'){
                    dp[i][j] = i==0?1:dp[i-1][j] + 1;
                }
            }
        }

        for(int[] d:dp){

            int[] left = new int[d.length];
            int[] right = new int[d.length];
            left[0] = -1;
            right[d.length-1] = d.length;
            for(int i = 0;i< d.length;i++){
                int prev = i-1;
                while(prev>=0 && d[prev]>=d[i]){
                    prev = left[prev];
                }
                left[i] = prev;
            }

            for(int i = d.length-2;i>=0;i--){
                int prev = i+1;
                while(prev<d.length && d[prev]>=d[i]){
                    prev = right[prev];
                }
                right[i] = prev;
            }

            for(int i = 0;i<d.length;i++){
                int diff = right[i] - left[i]-1;
                max = Math.max(max, diff * d[i]);
            }
        }
        return max;

    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
