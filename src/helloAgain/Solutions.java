package helloAgain;

import com.sun.prism.shader.AlphaOne_Color_AlphaTest_Loader;
import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i:nums){
            int index = Math.abs(i);
            if(nums[index-1]>0){
                nums[index-1] *= -1;
            }
        }

        List<Integer> res = new ArrayList<>();
        for(int i = 0;i< nums.length;i++){
            if(nums[i]>0)
                res.add(i+1);
        }
        return res;

    }



    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
