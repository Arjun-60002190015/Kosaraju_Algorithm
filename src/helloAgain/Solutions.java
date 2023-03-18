package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i:nums){
            pq.add(i);
        }
        while(k>0){
            int val = pq.poll();
            pq.add(-val);
            k--;
        }
        int sum = 0;
        while (!pq.isEmpty()){
            sum += pq.poll();

        }
        return sum;

    }



    public static void main(String[] args){

        int[] nums = {-5, 8, -14, 2, 4, 12};
        //System.out.println(maxSub(nums, -5));

    }

}
