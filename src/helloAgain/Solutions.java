package helloAgain;

import java.util.*;



public class Solutions {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int i:nums){
            if(map.get(i)==n/2)
                index = i;
        }
        return index;

    }


    public static void main(String[] args){
        int[] arr = {1,5,2, 4, 1};
        //System.out.println((arr));

    }

}
