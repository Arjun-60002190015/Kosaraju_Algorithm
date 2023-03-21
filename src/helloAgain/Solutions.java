package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public long zeroFilledSubarray(int[] nums) {
        long sum = 0;
        long count = 0;
        for(int i:nums){
            if(i==0)
                count++;
            else count = 0;
            sum += count;
        }
        return sum ;
    }




        public static void main(String[] args){

        int[] nums = {-5, 8, -14, 2, 4, 12};
        //System.out.println(maxSub(nums, -5));

    }

}
