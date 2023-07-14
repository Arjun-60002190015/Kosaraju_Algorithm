package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    public int maximumScore(int a, int b, int c) {
        int[] res = new int[3];
        res[0] = a;
        res[1] = b;
        res[2] = c;
        return helper(res);

    }

    public int helper(int[] nums){
        Arrays.sort(nums);
        if(nums[1]==0)
            return 0;
        else {
            nums[2]--;
            nums[1]--;
            return 1 + helper(nums);
        }
    }

    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
