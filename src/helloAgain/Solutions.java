package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int minMoves(int[] nums) {
        int min = nums[0];
        for(int i:nums){
            min = Math.min(min, i);
        }
        int sum = 0;
        for(int i:nums){
            sum += i - min;
        }
        return sum;

    }



    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};


        //System.out.println(maxOperations(nums, 5));

    }

}
