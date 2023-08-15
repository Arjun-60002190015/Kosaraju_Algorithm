package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {

    public int findPairs(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> rep = new HashSet<>();
        int count = 0;
        for(int i:nums)
            if(set.contains(i)) rep.add(i);
            else set.add(i);
        for(int i:set){

            if(set.contains(i-k)) count++;
            //if(set.contains(nums[i]+k)) count++;
        }
        if(k==0) return rep.size();
        return count;

    }



    public static void main(String[] args){
        int[] nums = {4, 5, 2, 1};
        int[] quesries = {3, 10, 21};
        //System.out.println()
    }

}
