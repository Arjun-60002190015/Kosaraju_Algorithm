package helloAgain;

import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int longestSubarray(int[] nums, int limit) {
        PriorityQueue<Integer> max = new PriorityQueue<>();
        PriorityQueue<Integer> min = new PriorityQueue<>((a,b)-> Integer.compare(b,a));
        int end = 0;
        int start = 0;
        int len = 0;
        while (end< nums.length){
            min.add(nums[end]);
            max.add(nums[end]);
            while(Math.abs(max.peek() - min.peek())>limit){
                min.remove(nums[start]);
                max.remove(nums[start]);
                start++;
            }
            len = Math.max(len, end-start+1);
            end++;
        }
        return len;

    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
