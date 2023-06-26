package helloAgain;

import com.sun.deploy.security.CredentialManager;
import com.sun.prism.shader.AlphaOne_Color_AlphaTest_Loader;
import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int prod = 1;
        int end = 0;
        int start = 0;
        int max = 0;
        while(end<nums.length){
            prod *= nums[end];
            while(prod>=k && start<end){
                prod /= nums[start];
                start++;
            }
            if(prod<k){
                max += end-start+1;
            }
            end++;
        }
        return max;

    }




    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
