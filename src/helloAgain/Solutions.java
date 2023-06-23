package helloAgain;

import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int findLength(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length+1][nums2.length+1];
        int ans = 0;
        for(int i = 1;i<=nums1.length;i++){
            for(int j = 1;j<= nums2.length;j++){
                if(nums1[i-1]==nums2[j-1]){
                    dp[i][j] = 1 + dp[i-1][j-1];
                    ans = Math.max(dp[i][j], ans);
                }else{
                    dp[i][j] = 0;
                }
            }
        }
        return ans;

    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
