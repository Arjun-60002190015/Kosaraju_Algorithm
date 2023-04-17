package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for(int i = 0;i< nums.length;i++){
            if(map.containsKey(target - nums[i])){
                res[0] = i;
                res[1] = map.get(target - nums[i]);
            }else map.put(nums[i], i);
        }
        return res;

    }



    public static void main(String[] args){
        int[] nums = {2, 3, 5, 1, 3};

        //System.out.println(kidsWithCandies(nums, 3));

    }

}
