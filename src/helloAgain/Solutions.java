package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public int findPairs(int[] nums, int k) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int i:map.keySet()){
            if((k>0 && map.containsKey(i+k) || (k==0 && map.get(i)>1))){
                res++;
            }
        }
        return res;

    }




    public static void main(String[] args){

        int[] nums = {-5, 8, -14, 2, 4, 12};
        //System.out.println(maxSub(nums, -5));

    }

}
