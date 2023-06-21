package helloAgain;

import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public long minCost(int[] nums, int[] cost) {
        int left = nums[0];
        int right = nums[0];
        for(int i:nums){
            left = Math.min(left, i);
            right = Math.max(right, i);
        }
        long ans = 0;
        while(left<right){
            int mid = (left+right)/2;
            long one = helper(nums, cost, mid);
            long two = helper(nums, cost, mid+1);
            if(one>two){
                left = mid+1;
                ans = two;
            }else{
                right = mid;
                ans = one;
            }
        }
        return ans;
    }

    public long helper(int[] nums, int[] cost, int mid){
        long totalCost = 0L;
        for(int i = 0;i<nums.length;i++){
            totalCost += 1L * Math.abs(nums[i]-mid)*cost[i];
        }
        return totalCost;
    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
