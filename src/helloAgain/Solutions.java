package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1 );
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> map.get(a) - map.get(b));
        pq.addAll(map.keySet());

        int[] res = new int[k];
        for(int i = 0;i<k;i++){
            res[i] = pq.poll();
        }
        return res;


    }






    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};

    }

}
