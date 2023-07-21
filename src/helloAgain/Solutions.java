package helloAgain;


import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int minDays(int[] bloomDay, int m, int k) {
        //Arrays.sort(bloomDay);
        int start = 1;
        int end = 1;
        for(int i:bloomDay){
            start = Math.min(start, i);
            end = Math.max(end, i);
        }
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(helper(bloomDay, mid, k, m)){
                ans = mid;
                end = mid-1;
            }else start = mid+1;
        }
        return ans;
    }

    public boolean helper(int[] bloomday, int mid, int k, int m){
        int count = 0;
        int mC = 0;
        for(int i:bloomday){
            if(i<=mid){
                count++;
            }else count = 0;
            if(count==k) {
                mC++;
                count = 0;
            }
        }
        return mC>= m;
    }




    public static void main(String[] args){
        int[] nums = {2, 2, 2, 2, 2};

        //System.out.println(findLengthOfLCIS(nums));

    }

}
