package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int countPairs(int[] deliciousness) {
            int result = 0;
            int MOD=1000000007;
            Map<Integer, Integer> map = new HashMap<>();
            for(int i=0; i<deliciousness.length; i++){
                for(int j=0; j<32; j++){
                    int key = (int)Math.pow(2, j);
                    int value = key - deliciousness[i];
                    result = (result + map.getOrDefault(value, 0))%MOD;
                }
                map.put(deliciousness[i], map.getOrDefault(deliciousness[i], 0)+1);
            }
            return result;
    }



    public static void main(String[] args){
        int[] nums = {2, 3, 5, 1, 3};
        String ne = "ab";
        String we = "pqrs";

        //System.out.println(mergeAlternately(ne, we));

    }

}
