package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {
    public int minAbsoluteDifference(List<Integer> nums, int x) {
        TreeSet<Integer> set = new TreeSet<>();
        int min = Integer.MAX_VALUE;
        for(int i = x;i<nums.size();i++){
            set.add(nums.get(i-x));
            Integer ceil = set.ceiling(nums.get(i));
            if(ceil!=null) min = Math.min(min, Math.abs(ceil - nums.get(i)));
            Integer floor = set.floor(nums.get(i));
            if(floor!=null) min = Math.min(min, Math.abs(floor- nums.get(i)));
        }
        return min;

    }


    public static void main(String[] args){
        int[] nums = {4, 5, 2, 1};
        int[] quesries = {3, 10, 21};
        //System.out.println()
    }

}
