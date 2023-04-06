package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public static int[] sortColors(int[] nums) {
        int zeroes = 0;
        int ones = 0;
        int twos = 2;
        for(int i = 0;i< nums.length;i++){
            if(nums[i]==0)
                zeroes++;
            if(nums[i]==1)
                ones++;
            if(nums[i]==2)
                twos++;
        }
        for(int i = 0;i<zeroes;i++){
            nums[i] = 0;
        }
        for(int i = zeroes;i<zeroes+ones;i++){
            nums[i] = 1;
        }
        for(int i = zeroes+ones;i< nums.length;i++){
            nums[i] = 2;
        }
        return nums;

    }




    public static void main(String[] args){
        int[] nums = {2, 0, 2, 1, 1, 0};

        System.out.println(sortColors(nums));

    }

}
