package helloAgain;

import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int max = k;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<k;i++){
            map.put(answerKey.charAt(i), map.getOrDefault(answerKey.charAt(i), 0)+1);
        }
        int left = 0;
        int right = k;
        while(right<answerKey.length()){
            map.put(answerKey.charAt(right), map.getOrDefault(answerKey.charAt(right), 0)+1);
            while(Math.min(map.getOrDefault('T', 0), map.getOrDefault('F', 0))>k){
                map.put(answerKey.charAt(left), map.get(answerKey.charAt(left))-1);
                left++;
            }
            max = Math.max(max, right-left+1);
            right++;
        }
        return max;

    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
