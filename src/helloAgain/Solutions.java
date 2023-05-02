package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {

    public int waysToSplitArray(int[] nums) {
        int sum = 0;
        for(int i:nums){
            sum+= i;
        }
        int count = 0;
        int rightSum = 0;
        for(int i = 0;i< nums.length;i++){
            rightSum += nums[i];
            if(rightSum>(sum - rightSum))
                count++;
        }
        return count;

    }







    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};


        //System.out.println(maxOperations(nums, 5));

    }

}
