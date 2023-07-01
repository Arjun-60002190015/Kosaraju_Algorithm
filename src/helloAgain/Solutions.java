package helloAgain;

import com.sun.deploy.security.CredentialManager;
import com.sun.prism.shader.AlphaOne_Color_AlphaTest_Loader;
import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {

    public int numTilePossibilities(String tiles) {
        HashSet<String> set = new HashSet<>();
        boolean[] vis = new boolean[tiles.length()];
        helper(tiles, "", set, vis);
        return set.size()-1;

    }

    public void helper(String tiles, String curr,  HashSet<String> set, boolean[] vis){
        set.add(curr);

        for(int i = 0;i<tiles.length();i++){
            if(!vis[i]){
                vis[i] = true;
                helper(tiles, curr+ tiles.charAt(i), set, vis);
                vis[i] = false;
            }
        }

    }


    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
