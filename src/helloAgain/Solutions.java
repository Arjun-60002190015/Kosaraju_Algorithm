package helloAgain;


import javafx.scene.layout.Priority;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int reductionOperations(int[] nums) {
        Arrays.sort(nums);

        HashMap<Integer, Integer> map = new HashMap<>();
        int x = 0;
        for(int i:nums){
            if(map.containsKey(i)) continue;
            else{
                map.put(i, x);
                x++;
            }
        }
        int count = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i]>nums[0]){
                count += map.get(nums[i]);
            }
        }
        return count;
    }


    public static void main(String[] args){

        //System.out.println(minSpeedOnTime(new int[]{1, 3, 2}, 1.9));
    }

}
