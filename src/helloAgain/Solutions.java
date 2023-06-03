package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int i = 0;i<n;i++){
            if(manager[i]!=-1){
                list.get(manager[i]).add(i);
            }
        }
        return helper(headID, list, informTime);

    }

    public int helper(int i, List<List<Integer>> list, int[] time){
        int max = 0;
        for(int emp:list.get(i)){
            int timex = helper(emp, list, time);
            max = Math.max(max, timex);
        }

        return max + time [i];
    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
