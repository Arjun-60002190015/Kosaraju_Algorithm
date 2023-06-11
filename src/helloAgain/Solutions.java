package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {

    //Knapsack variant type - Recursion
    int max= 0 ;
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n = heights.length;
        if(n==0)
            return 0;
        helper(heights, bricks, ladders, 0, n, 0);
        return max;

    }

    public void helper(int[] heights, int bricks, int ladders, int index, int n, int count){
        if(index==n-1) {
            count = count;
            max = Math.max(max, count);
            return;
        }

        if(heights[index]>=heights[index+1]){
            helper(heights, bricks, ladders, index+1, n, count+1);
        }else{
            int diff = heights[index+1] - heights[index];
            if(bricks>=diff){
                helper(heights, bricks - diff, ladders, index+1, n, count+1);
                if(ladders>0){
                    helper(heights, bricks, ladders-1, index+1, n, count+1);
                }
            }else if(ladders>0){
                helper(heights, bricks, ladders-1, index+1, n, count+1);
            }
        }
        max = Math.max(count, max);

    }

    // Max-Heap(optimized)

    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i<heights.length-1;i++){
            if(heights[i]>=heights[i+1])
                continue;
            bricks -= heights[i+1] - heights[i];
            pq.add(heights[i+1] - heights[i]);

            if(bricks<0){
                bricks += pq.poll();
                if(ladders>0){
                    ladders--;
                }else return i;
            }
        }
        return heights.length-1;

    }


    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
