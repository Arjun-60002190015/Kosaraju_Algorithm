package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0] = 1;
        for(int i = 1;i<arr.length;i++){
            if(Math.abs(arr[i-1] - arr[i])<=1)
                continue;
            else arr[i] = arr[i-1]+1;
        }
        return arr[arr.length-1];


    }

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};


        //System.out.println(maxOperations(nums, 5));

    }

}
