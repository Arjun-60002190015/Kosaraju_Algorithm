package helloAgain;


import javafx.scene.layout.Priority;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int minimumMountainRemovals(int[] nums) {
        int[] left = new int[nums.length];
        for(int i = 0;i< nums.length;i++){
            left[i] = 1;
            for(int j = 0;j<i;j++){
                if(nums[j]<nums[i]){
                    left[i] = Math.max(left[i], left[j]+1);
                }
            }
        }
        int[] right = new int[nums.length];
        for(int i = nums.length-1;i>=0;i--){
            right[i] = 1;
            for(int j = nums.length-1;j>i;j--){
                if(nums[j]<nums[i]){
                    right[i] = Math.max(right[i], right[j]+1);
                }
            }
        }
        int len = 0;
        for(int i = 0;i< nums.length;i++){
            if(right[i]>=2 && left[i]>=2) {
                len = Math.max(len, right[i] + left[i] - 1);
            }
        }
        return nums.length-len;

    }
    public static void main(String[] args){

    }

}
