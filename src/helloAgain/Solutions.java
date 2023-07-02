package helloAgain;

import com.sun.deploy.security.CredentialManager;
import com.sun.prism.shader.AlphaOne_Color_AlphaTest_Loader;
import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {

    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        helper(0, s.length(), new String(""), res, s);
        return res;
    }

    public void helper(int i, int end, String p, List<String> res, String s){
        if(i==end){
            res.add(p);
            return;
        }
        char ch = s.charAt(i);
        if(!Character.isDigit(ch)){
            if(Character.isUpperCase(ch)){
                helper(i+1, end, p+Character.toLowerCase(ch), res, s);
            }else{
                helper(i+1, end, p+Character.toUpperCase(ch), res, s);
            }
        }
        helper(i+1, end, p+ch, res, s);
    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
