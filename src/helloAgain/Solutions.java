package helloAgain;

import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int longestBeautifulSubstring(String word) {
        HashSet<Character> set = new HashSet<>();
        if(word.length()<5)
            return 0;

        int end = 1;
        int curr = 1;
        int max = 0;
        set.add(word.charAt(0));
        while(end<word.length()){
            if(word.charAt(end)>=word.charAt(end-1)){
                set.add(word.charAt(end));
                curr++;
            }else {
                if(set.size()==5)
                    max = Math.max(curr, max);
                set.clear();
                curr = 1;
                set.add(word.charAt(end));


            }
            end++;


        }
        if(set.size()==5)
            max = Math.max(curr, max);
        return max;

    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
