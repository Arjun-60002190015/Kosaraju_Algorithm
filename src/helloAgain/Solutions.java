package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:nums) pq.add(i);
        long sum = 0;
        while(k-->0){
            int num = pq.poll();
            sum += num;
            num = (int)Math.ceil(num/3.0);
            pq.add(num);
        }
        return sum;

    }




    public static void main(String[] args){
        List<Integer> res = new ArrayList<>();
        res.add(2);
        res.add(3);
        res.add(3);
        res.add(2);
        res.add(3);
        //System.out.println(canSplitArray(res, 6));

    }

}
