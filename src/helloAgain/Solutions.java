package helloAgain;

import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int findLengthOfLCIS(int[] nums) {
        int end = 1;
        int curr = 1;
        int start = 0;
        int max = 1;


        while(end< nums.length){
            if(nums[end]>nums[start]){
                curr++;
                end++;
                start++:
            }
            else{
                start = end;
                end++;
                curr = 1;
            }
            max = Math.max(curr, max);

        }
        return max;

    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
