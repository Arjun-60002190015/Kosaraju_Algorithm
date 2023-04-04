package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            int mid = low + (high - low)/2;
            if(arr[mid]<arr[mid+1]){
                low = mid+1;
            }else if(arr[mid]>arr[mid+1]){
                high  = mid;
            }
        }
        return low;

    }


    public static void main(String[] args){
        String num = "52";
        //System.out.println(largestOddNumber(num));

    }

}
