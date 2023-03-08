package helloAgain;

import java.util.*;



public class Solutions {


    public int specialArray(int[] nums) {
        int start = 0;
        int end = nums.length;
        int ans = -1;
        while(start<=end){
            int mid = start + (end - start/2);
            int count = count(mid, nums);
            if(count==mid)
                return ans = mid;
            else if(count>mid){
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }

    public int count(int x, int[] nums){
        int count = 0;
        for(int i:nums){
            if(i>=x)
                count++;
        }
        return count;
    }


    public static void main(String[] args){
        int[] arr = {1,5,2, 4, 1};
        //System.out.println((arr));

    }

}
