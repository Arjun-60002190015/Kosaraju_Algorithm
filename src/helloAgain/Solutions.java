package helloAgain;

import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        Map<String, Integer> map = new HashMap<>();
        int[] freq = new int[26];
        int uniq = 0;
        int left =0 ;
        int right = 0;
        while(right<s.length()){
            char r = s.charAt(right++);
            freq[r-'a']++;
            if(freq[r-'a']==1)
                uniq++;

            while(right-left>=minSize && right-left<=maxSize){
                if(uniq<=maxLetters){
                    String sub = s.substring(left, right);
                    map.put(sub, map.getOrDefault(sub, 0)+1);
                }
                char l = s.charAt(left++);
                freq[l-'a']--;
                if(freq[l-'a']==0)
                    uniq--;
            }
        }
        int res = 0;
        for(int i:map.values()){
            res = Math.max(res, i);
        }
        return res;

    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
