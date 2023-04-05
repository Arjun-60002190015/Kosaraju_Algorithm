package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public static int maximumCandies(int[] candies, long k) {
        int start = 1;
        int end = 1;
        for(int i:candies){
            end = Math.max(end, i);
        }
        while(start<end){
            int mid = start + (end - start)/2;
            if(getSum(candies, k, mid)){
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }
        return getSum(candies, k, start)?start:start - 1;


    }

    public static boolean getSum(int[] candies, long k, int mid){
        int total = 0;
        for(int i:candies){
            total += i/mid;
        }
        if(total>=k)
            return true;
        return false;

    }




    public static void main(String[] args){
        int[] nums = {5, 8, 6};
        int target = 4;

        System.out.println(maximumCandies(nums, 3));

    }

}
