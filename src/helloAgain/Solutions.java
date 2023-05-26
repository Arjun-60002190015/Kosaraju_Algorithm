package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        if(n==1)
            return true;
        int sum = 0;
        for(int i:nums){
            sum += i;
        }
        int ans = predict(nums, 0, n-1);
        if(ans<(sum - ans))
            return false;
        return true;

    }

    public int predict(int[] nums, int start, int end){
        if(start>end)
            return 0;
        int one = nums[start] + Math.min(predict(nums, start+2, end), predict(nums, start+1, end-1));
        int two = nums[end] + Math.min(predict(nums, start+1, end-1), predict(nums, start, end-2));
        return Math.max(one, two);
    }






    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};

    }

}
