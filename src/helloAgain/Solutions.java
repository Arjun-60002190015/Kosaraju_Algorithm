package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for(int i = 1;i< nums.length;i++){
            min = Math.min(nums[i]-nums[i-1], min);
        }
        return min;

    }


    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
