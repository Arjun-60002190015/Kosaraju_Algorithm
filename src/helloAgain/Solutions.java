package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public static int findMaxConsecutiveOnesTLE(int[] nums) {
        int start = 0;
        int end = 0;
        int count = 0;
        int max = 0;
        while(end< nums.length){
            if(nums[end]==0){
                count = end - start +1;
                max = Math.max(max, count);
                start = end;
            }
            else{
                count++;
                end++;
            }
        }
        return max;

    }


    public int findMaxConsecutiveOnes(int[] nums) {
            if(nums.length==1)
                return nums[0];
            if(nums.length==2 && nums[0]==0 && nums[1]==0)
                return 0;
            int max = Integer.MIN_VALUE;
            int curr = 0;
            for(int i = 0;i<nums.length;i++){
                if(nums[i]==0){
                    curr = 0;
                }else{
                    curr = Math.max(curr + nums[i], nums[i]);
                    max = Math.max(max, curr);
                }
            }
            return max;

        }




    public static void main(String[] args){

        int[] nums = {-5, 8, -14, 2, 4, 12};
        //System.out.println(maxSub(nums, -5));

    }

}
