package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length-k+1];
        Deque<Integer> pq = new ArrayDeque<>();
        int start = 0;
        int end = 0;
        while(end< nums.length){
            if(pq.isEmpty()){
                pq.add(nums[end]);
            }
            else{
                while(!pq.isEmpty() && nums[end]>pq.peekLast()){
                    pq.pollLast();
                }
                pq.add(nums[end]);
            }

            if(end-start+1==k){
                res[start] = pq.peek();
                if(nums[start]==pq.peek()){
                    pq.pollFirst();
                }
                start++;
            }
            end++;
        }
        return res;

    }



    public static void main(String[] args){
        int[] nums = {4, 5, 2, 1};
        int[] quesries = {3, 10, 21};
        //System.out.println()
    }

}
