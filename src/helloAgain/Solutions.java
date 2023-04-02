package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        while(!map.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            for(Integer key: map.keySet()){
                if(map.get(key)>0)
                    temp.add(key);
                map.put(key, map.get(key) - 1);
            }
            if(temp.size()==0)
                break;
            res.add(new ArrayList<>(temp));
        }
        return res;

    }






    public static void main(String[] args){
        int[] arr = {2, 5, 5, 7};
        int[] nums = {1, 3, 4, 1, 2, 3, 1};
        System.out.println(findMatrix(nums));

    }

}
