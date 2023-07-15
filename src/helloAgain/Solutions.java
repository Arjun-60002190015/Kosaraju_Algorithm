package helloAgain;


import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:piles){
            pq.offer(i);
        }
        while(k>0){
            int res = pq.poll();
            res = res - (int)Math.floor(res/2);
            pq.offer(res);
            k--;
        }
        int sum = 0;
        for(int i=0;i< piles.length;i++){
            sum += pq.poll();
        }
        return sum;

    }

    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
