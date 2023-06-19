package helloAgain;

import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        int curr = 0;
        for(int left = 0, right = 0;right< nums.length;right++){
            curr += nums[right];
            if(set.contains(nums[right])){
                while(nums[left]!=nums[right]){
                    curr -= nums[left];
                    set.remove(nums[left]);
                    left++;

                }
                if(nums[left]==nums[right]){
                    curr -= nums[left];
                    set.remove(nums[left]);
                    left++;
                }
            }
            set.add(nums[right]);
            sum = Math.max(sum, curr);
        }
        return sum;

    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
