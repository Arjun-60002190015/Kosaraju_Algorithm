package helloAgain;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {

    public static int maxScore(int[] nums) {
        int count = 0;
        long sum = 0;
        Arrays.sort(nums);

        for(int i = nums.length-1;i>=0;i--){
            sum += nums[i];
            if(sum>0)
                count++;
            else break;
        }
        return count;
    }




    public static void main(String[] args){

        int[] nums = {-2, -3, 0};
        System.out.println(maxScore(nums));

    }

}
