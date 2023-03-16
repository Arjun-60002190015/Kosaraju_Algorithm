package helloAgain;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {


    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        for(int i = 0;i< nums.length;i++){
            res[i] = -1;
            int j = i;
            while(j++<i+ nums.length){
                if(nums[i] < nums[j%nums.length]){
                    res[i] = nums[j% nums.length];
                    break;
                }
            }
        }
        return res;



    }




    public static void main(String[] args){

        int[] nums = {5, 10, 30, 20, 40};
        //System.out.println(bsNearlySorted(nums, 40));

    }

}
