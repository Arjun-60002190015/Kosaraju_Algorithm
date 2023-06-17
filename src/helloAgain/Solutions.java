package helloAgain;

import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
        public double findMaxAverage(int[] nums, int k) {
            double res = Integer.MIN_VALUE;
            int start = 0;
            int end = 0;
            int sum = 0;
            while(end< nums.length){
                sum += nums[end++];
                if(end>=k) {
                    res = Math.max(res, sum / k);
                    sum -= nums[start++];
                }

            }
            return res;

        }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
