package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {

    public int findJudge(int n, int[][] trust) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //Set<Integer> set = new HashSet<>();

        for(int[] tr:trust){
            map.put(tr[1], map.getOrDefault(tr[1], 0)+1);
            //set.add(tr[0]);
        }
        if(map.size()==0 && n==1)
            return 1;
        for(int i = 0;i<n;i++){
            if(map.get(i)==n-1)
                return i;
        }
        return -1;

    }



    public static void main(String[] args){

        int[] nums = {-5, 8, -14, 2, 4, 12};
        //System.out.println(maxSub(nums, -5));

    }

}
