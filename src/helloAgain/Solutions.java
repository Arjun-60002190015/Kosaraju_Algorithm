package helloAgain;

import com.sun.prism.shader.AlphaOne_Color_AlphaTest_Loader;
import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int numSplits(String s) {
        int n = s.length();
        int[] count = new int[n];
        HashSet<Character> set = new HashSet<>();
        for(int i = n-1;i>=0;i--){
            count[i] = set.size();
            set.add(s.charAt(i));
        }
        int res = 0;
        set.clear();
        for(int i = 0;i<n;i++){
            set.add(s.charAt(i));
            if(set.size()==count[i])
                res++;
        }
        return res;

    }




    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
