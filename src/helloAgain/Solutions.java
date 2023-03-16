package helloAgain;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {


    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        for(int value: map.values()){
            q.offer(value);
        }
        int n = arr.length;
        int res = 0;
        while(n>arr.length/2){
            n = n- q.poll();
            res++;
        }
        return res;
    }





        public static void main(String[] args){

        int[] nums = {5, 10, 30, 20, 40};
        //System.out.println(bsNearlySorted(nums, 40));

    }

}
