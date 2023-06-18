package helloAgain;

import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int numberOfSubstrings(String s) {
        int i = 0, j= 0, count = 0, temp = 0;
        Map<Character, Integer> map = new HashMap<>();
        while(j<s.length()){
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0)+1);
            while(map.size()==3){
                temp++;
                ch = s.charAt(i);
                map.put(ch, map.get(ch)-1);
                if(map.get(ch)==0)
                    map.remove(ch);
                i++;
            }
            count += temp;
            j++;
        }
        return count;

    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
