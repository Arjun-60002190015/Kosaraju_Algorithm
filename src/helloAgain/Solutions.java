package helloAgain;

import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int max = 0;
        int left = 0;
        int most = 0;
        for(int right = 0;right<s.length();right++){
            freq[s.charAt(right) - 'A']++;
            most = Math.max(freq[s.charAt(right) - 'A'], most);

            int replace = right - left+1 - most;
            if(replace>k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            max = Math.max(max, right-left+1);
        }
        return max;

    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
