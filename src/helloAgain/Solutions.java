package helloAgain;

import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int numberOfSubarrays(int[] nums, int k) {
        int start = 0;
        int odd = 0;
        //Map<Integer, Integer> map = new HashMap<>();
        int end = 0;
        int count = 0;
        int res = 0;
        while(end<nums.length){
            if(nums[end]%2!=0){
                odd++;
                count = 0;
            }
            while(odd==k){
                count++;
                if(nums[start]%2!=0) {
                    odd--;
                }
                start++;
            }
            res += count;
            end++;

        }
        return count;

    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
