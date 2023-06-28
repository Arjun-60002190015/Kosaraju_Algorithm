package helloAgain;

import com.sun.deploy.security.CredentialManager;
import com.sun.prism.shader.AlphaOne_Color_AlphaTest_Loader;
import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] right = new int[n];
        int[] left = new int[n];
        left[0] = -1;
        right[n-1] = n;

        for(int i = 1;i<n;i++){
            int prev= i-1;
            while(prev>=0 && heights[prev]>=heights[i]){
                prev = left[prev];
            }
            left[i] = prev;
        }
        for(int i=  n-2;i>=0;i--){
            int prev=  i+1;
            while(prev<n && heights[prev]>=heights[i]){
                prev = right[prev];
            }
            right[i] = prev;
        }

        int max= 0 ;
        for(int i=  0;i<n;i++){
            int curr = right[i] - left[i] - 1;
            max = Math.max(curr*heights[i], max);
        }
        return max;

    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
