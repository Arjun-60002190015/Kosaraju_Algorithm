package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        Arrays.sort(strs);
        int index = 0;
        while(index<strs[0].length() && index<strs[strs.length-1].length()){
            if(strs[0].charAt(index)==strs[strs.length-1].charAt(index)){
                res += strs[0].charAt(index);
                index++;
            }else break;
        }
        return res;


    }


    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
