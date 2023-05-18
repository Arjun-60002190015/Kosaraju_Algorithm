package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    //bruteForce
    public int[] maxSlidingWindowBruteForce(int[] nums, int k) {
        if(nums==null || k<=0)
            return new int[0];
        int[] arr = new int[nums.length-k+1];
        for(int i = 0;i< nums.length-k+1;i++){
            int max = Integer.MIN_VALUE;
            for(int j = i;j<i+k;j++){
                max = Math.max(nums[j], max);
            }
            arr[i] = max;
        }
        return arr;

    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if(nums==null || k<=0)
            return new int[0];

        int index = 0;
        int[] r = new int[n-k+1];
        Deque<Integer> pq = new ArrayDeque<>();
        for(int i = 0;i< nums.length;i++){
            while(!pq.isEmpty() && pq.peek()<i-k+1){
                pq.poll();
            }

            while(!pq.isEmpty() && nums[pq.peek()] < nums[i]){
                pq.pollLast();
            }

            pq.offer(i);
            if(i>=k-1){
                r[index] = nums[pq.peek()];
                index++;
            }
        }
        return r;


    }




    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};

    }

}
