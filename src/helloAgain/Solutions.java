package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public static int maxOperations(int[] nums, int k) {
        //HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0;i< nums.length;i++){
            if(map.containsKey(k - nums[i]) && map.get(k - nums[i])>0){
                count++;
                map.put(k - nums[i], map.get(k - nums[i])-1);

            }
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        return count;

    }



    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};


        System.out.println(maxOperations(nums, 5));

    }

}
