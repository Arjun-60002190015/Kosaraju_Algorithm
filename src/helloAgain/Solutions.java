package helloAgain;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {

    public int minimumSize(int[] nums, int maxOperations) {
        int min = 1;
        int max = Integer.MIN_VALUE;
        for(int i:nums){
            max = Math.max(max, i);
        }
        while(min<max){
            int mid = min + (max - min)/2;
            if(helper(nums, mid, maxOperations)){
                max = mid;
            }else{
                min = mid+1;
            }
        }
        return min;


    }

    public boolean helper(int[] nums, int mid, int max){
        int count = 0;
        for(int i:nums){
            count += (i-1)/mid;
            if(count>max)
                return false;
        }
        return true;
    }









        public static void main(String[] args){
        char[] c = {'c', 'f', 'j'};
        int n = 5;
        //System.out.println(nextGreatestLetter(c, 'a'));

    }

}
