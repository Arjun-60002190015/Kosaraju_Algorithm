package helloAgain;

import com.sun.prism.shader.AlphaOne_Color_AlphaTest_Loader;
import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public long[] sumOfThree(long num) {
        long[] res = new long[3];
        if(num%3!=0){
            return res;
        }
        num/=3;
        return new long[]{num-1, num, num+1};

    }




    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
