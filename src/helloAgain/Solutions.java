package helloAgain;

import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int longestSubarray(int[] nums) {
        int k = 1;
        int xero = 0;
        int start = 0;
        int end = 0;
        int max = 0;
        while(end< nums.length){
            if(nums[end]==0)
                xero++;
            if(xero>k){
                if(nums[start]==0)
                    xero--;
                start++;
            }
            max = Math.max(max, end-start);
            end++;
        }
        return max;

    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
