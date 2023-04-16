package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int maxDivScore(int[] nums, int[] divisors) {
        int res = divisors[0];
        int max = 0;
        for(int i = 0;i<divisors.length;i++){
            int count = 0;
            for(int j = 0;j< nums.length;j++){
                if(nums[j]%divisors[i]==0)
                    count++;
            }
            if(count>max){
                max = count;
                res = divisors[i];
            }
            if(count==max){
                max = count;
                res = Math.min(res, divisors[i]);
            }
        }
        return res;

    }


    public static void main(String[] args){
        int[] nums = {2, 3, 7, 5, 10};

        //System.out.println(largestNumber(nums));

    }

}
