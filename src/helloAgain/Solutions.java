package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    public long pickGifts(int[] gifts, int k) {
        long sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)-> b-a);
        for(int i:gifts){
            pq.offer(i);

        }
        long rem = 0;
        while(k>0){
            int x = pq.poll();
            x = (int)Math.sqrt(x);
            pq.offer(x);
            k--;

        }
        while(!pq.isEmpty()){
            sum += pq.poll();
        }
        return sum;

    }

    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
