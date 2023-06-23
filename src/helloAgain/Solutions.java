package helloAgain;

import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int equalSubstring(String s, String t, int maxCost) {
        int[] diff = new int[s.length()];
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            char f = t.charAt(i);
            diff[i] = Math.abs(c-f);
        }
        int max = 0;
        int curr = 0;
        int start = 0;
        int end = 0;
        while(end< diff.length){
            curr += diff[end++];
            while(curr>max){
                curr -= diff[start++];
            }
            max = Math.max(max, end-start+1);
        }
        return max;


    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
