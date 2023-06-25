package helloAgain;

import com.sun.deploy.security.CredentialManager;
import com.sun.prism.shader.AlphaOne_Color_AlphaTest_Loader;
import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        for(int i:nums){
            set.add(i);
        }
        for(int i:nums){

            int left = i-1;
            int right = i+1;
            int count = 1;
            while(set.contains(left)){
                count++;
                set.remove(left);
                left = left-1;
            }
            while(set.contains(right)){
                count++;
                set.remove(right);
                right++;
            }
            max = Math.max(count, max);
        }
        return max;

    }




    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
