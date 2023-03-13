package helloAgain;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {

    public static int BinarySearch(int[] n, int target) {
        int start = 0;
        int end = n.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(n[mid]>target){
                start = mid + 1;
            }else if(n[mid]<target){
                end = mid - 1;
            }
        }
        return start;
    }




    public static void main(String[] args){

        int[] nums = {20, 17, 15, 13, 11, 8, 7, 4, 3};
        System.out.println(BinarySearch(nums, 3));

    }

}
