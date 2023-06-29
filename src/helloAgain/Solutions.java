package helloAgain;

import com.sun.deploy.security.CredentialManager;
import com.sun.prism.shader.AlphaOne_Color_AlphaTest_Loader;
import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int minOperations(int[] nums) {
        int count = 0;
        for(int i = 1;i< nums.length;i++){
            if(nums[i]<=nums[i-1]){
                count += nums[i-1] - nums[i]+1;
                nums[i] += nums[i-1]+1 - nums[i];
            }
        }
        return count;

    }
    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
