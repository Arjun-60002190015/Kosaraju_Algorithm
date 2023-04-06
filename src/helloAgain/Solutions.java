package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int i: map.keySet()){
            if(nums.length/map.get(i)>(nums.length)/3)
                res.add(i);
        }
        return res;

    }




    public static void main(String[] args){
        int[] nums = {5, 8, 6};
        int target = 4;

        //System.out.println(maximumCandies(nums, 3));

    }

}
