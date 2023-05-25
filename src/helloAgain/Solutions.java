package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] temp = new int[n][n];
        for(int i = 0;i<n;i++){
            temp[i] = new int[]{efficiency[i], speed[i]};
        }
        Arrays.sort(temp, (a, b)-> b[0] - a[0]);
        PriorityQueue<Integer> queue = new PriorityQueue<>(k, (a, b)-> a-b);
        long res = 0, sum = 0;
        for(int[] tem:temp){
            queue.add(tem[1]);
            sum += tem[1];
            if(queue.size()>k){
                sum -= queue.poll();

            }
            res = Math.max(res, (sum * tem[0]));
        }
        return (int)(res%(1e9+7));


    }






    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};

    }

}
