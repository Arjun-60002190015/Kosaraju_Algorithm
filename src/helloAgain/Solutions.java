package helloAgain;


import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {

    public int longestArithSeqLength(int[] nums) {
        Map<Integer, Integer>[] map = new HashMap[nums.length];
        int count = 2;
        for(int i = 0;i< nums.length;i++){
            map[i] = new HashMap<>();
            for(int j = 0;j<i;j++){
                int diff = nums[i] - nums[j];
                map[i].put(diff, map[j].getOrDefault(diff, 1)+1);
                count = Math.max(count, map[i].get(diff));
            }
        }
        return count;

    }




    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
