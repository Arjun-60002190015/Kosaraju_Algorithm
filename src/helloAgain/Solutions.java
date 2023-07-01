package helloAgain;

import com.sun.deploy.security.CredentialManager;
import com.sun.prism.shader.AlphaOne_Color_AlphaTest_Loader;
import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    int res = Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        helper(cookies, 0, k, new int[k]);
        return res;

    }

    public void helper(int[] cookies, int index, int k, int[] h){
        if(index==cookies.length){
            int max = 0;
            for(int i:h){
                max = Math.max(i, max);
            }
            res = Math.min(res, max);
            return;
        }

        for(int i = 0;i<k;i++){
            h[i] += cookies[index];
            helper(cookies, index+1, k, h);
            h[i] -= cookies[index];
        }
    }


    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
