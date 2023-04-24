package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int lastStoneWeightUsingPriorityQueue(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int st:stones){
            pq.add(st);
        }
        while(pq.size()>1){
            int p = pq.poll();
            int q = pq.poll();
            if(p!=q){
                pq.add(p - q);
            }
        }
        return pq.isEmpty()? 0:pq.peek();
    }

    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<stones.length;i++){
            ar.add(stones[i]);
        }

        while(ar.size()>1){
            Collections.sort(ar);
            int y = ar.get(ar.size()-1);
            ar.remove(new Integer((y)));
            int x = ar.get(ar.size()-1);
            ar.remove(new Integer(x));
            if(x!=y){
                ar.add(y-x);
            }
        }

        if(!ar.isEmpty()){
            return ar.get(0);
        }
        return 0;

    }



    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};


        //System.out.println(maxOperations(nums, 5));

    }

}
