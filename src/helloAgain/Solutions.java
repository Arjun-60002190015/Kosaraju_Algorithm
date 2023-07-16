package helloAgain;


import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public long maximumImportance(int n, int[][] roads) {
        long[] freq = new long[n];
        for(int[] road:roads){
            freq[road[0]]++;
            freq[road[1]]++;
        }
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(long i:freq)
            pq.offer(i);
        long sum = 0;
        for(int i = n;i>=1;i--){
            sum += i*pq.poll();
        }
        return sum;

    }

    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
