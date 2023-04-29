package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int minOperations(int[] nums) {
        int ones = 0;
        for(int i:nums){
            if(i==1)
                ones++;
        }
        if(ones>0)
            return nums.length - ones;

        int ans = Integer.MAX_VALUE;
        for(int i = 0;i< nums.length;i++){
            int gcd = nums[i];
            for(int j = i+1;j< nums.length;j++){
                gcd = findGcd(gcd, nums[j]);
                if(gcd==1)
                    ans = Math.min(ans, j - i+ nums.length - 1);
            }
        }
        return ans == Integer.MAX_VALUE?-1:ans;

    }

    public int findGcd(int a, int b){
        if(a==0)
            return 0;
        return findGcd(b%a, a);
    }





    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};


        //System.out.println(maxOperations(nums, 5));

    }

}
