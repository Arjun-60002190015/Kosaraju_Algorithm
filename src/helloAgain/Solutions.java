package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i = 0;i< nums.length;i++){
            int sum = 0;
            for(int j = i;j< nums.length;j++){
                sum += nums[j];
                if(sum==k)
                    count++;
            }
        }
        return count;

    }




    public static void main(String[] args){

        int[] nums = {-5, 8, -14, 2, 4, 12};
        //System.out.println(maxSub(nums, -5));

    }

}
