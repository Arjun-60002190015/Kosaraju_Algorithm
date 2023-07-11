package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for(int i:nums){
            sum += i;
        }
        if(sum%k!=0)
            return false;
        boolean[] vis = new boolean[nums.length];
        Arrays.fill(vis, false);
        boolean flag = false;
        flag = helper(nums, sum/k, 0, vis, 0, k);
        return flag;
    }

    public boolean helper(int[] nums, int limit, int index, boolean[] vis, int curr, int k){
        if(curr==limit){
            return helper(nums, limit, 0, vis, 0, k-1);
        }

        if(k==1)
            return true;

        for(int i = index;i< nums.length;i++){
            if(vis[i] || curr+nums[i]>limit) continue;
            vis[i] = true;
            if(helper(nums, limit, i+1, vis, curr+nums[i], k))
                return true;
            vis[i] = false;
        }
        return false;
    }

    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
