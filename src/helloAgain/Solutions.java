package helloAgain;

import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int start = 0;
        int end = 0;
        int sum = 0;
        while(end<arr.length){
            sum += arr[end];
            if(end-start+1==k){
                if(sum/k>=threshold){
                    count++;
                }
                sum -= arr[start];
                start++;
            }
            end++;
        }
        return count;

    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
