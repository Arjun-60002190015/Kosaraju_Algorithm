package helloAgain;

import com.sun.prism.shader.AlphaOne_Color_AlphaTest_Loader;
import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int lengthOfLastWord(String s) {
        int res = 0;
        int n = s.length();
        boolean c = false;
        for(int i = n-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if(c)
                    break;
            }else{
                c = true;
                res++;
            }
        }
        return res;

    }




    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
