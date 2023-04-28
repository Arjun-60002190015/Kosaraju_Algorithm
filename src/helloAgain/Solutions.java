package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int mid = nums[nums.length/2];
        for(int i:nums){
            res += Math.abs(i - mid);
        }
        return res;


    }





    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};


        //System.out.println(maxOperations(nums, 5));

    }

}
