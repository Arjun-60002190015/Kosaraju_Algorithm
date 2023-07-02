package helloAgain;

import com.sun.deploy.security.CredentialManager;
import com.sun.prism.shader.AlphaOne_Color_AlphaTest_Loader;
import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(0, res, nums, new ArrayList<>());
        return res;
    }

    public void helper(int start, List<List<Integer>> res, int[] nums, List<Integer> temp){
        res.add(new ArrayList<>(temp));
        for(int i = start;i< nums.length;i++){
            temp.add(nums[i]);
            helper(start+1, res, nums, temp);
            temp.remove(temp.size()-1);
        }
    }





    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
