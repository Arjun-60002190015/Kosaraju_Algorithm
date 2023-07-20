package helloAgain;


import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int maxDistance(int[] nums1, int[] nums2) {
        int max = 0;
        for(int i = 0;i< nums1.length;i++){
            int start = i;
            int end = nums2.length-1;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(nums2[mid]>=nums1[i] && mid>=i){
                    max=  Math.max(max, mid-i);
                    start = mid+1;
                }else end = mid-1;
            }
        }
        return max;

    }




    public static void main(String[] args){

        //System.out.println(arrangeCoins(3));

    }

}
