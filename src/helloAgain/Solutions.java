package helloAgain;


import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int shipWithinDays(int[] weights, int days) {
        int start = 0;
        int end = 0;
        for(int i:weights){
            start = Math.max(start, i);
            end += i;
        }


        while(start<=end){
            int mid = start + (end-start)/2;
            if(helper(weights, mid, days)){
                end = mid-1;
            }else
                start = mid + 1;
        }
        return start;
    }

    public boolean helper(int[] weights, int target, int days){
        int count = 1;
        int sum =  0;
        for(int i = 0;i<weights.length;i++){
            if(count>days) return false;
            if(sum+weights[i]>target){
                sum = 0;
                count++;

            }
            //else {
                sum += weights[i];

        }
        return count<=days;
    }




    public static void main(String[] args){

        //System.out.println(arrangeCoins(3));

    }

}
