package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max = 0;
        int end = nums.length-1;
        for(int i = 0;i< nums.length;i++){
            max = Math.max(max, nums[i]+nums[end]);
            end--;
        }
        return max;

    }


    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
