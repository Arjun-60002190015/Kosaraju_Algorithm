package helloAgain;

import java.util.*;



public class Solutions {


    public int minEatingSpeed(int[] piles, int h) {
        return bc(piles, h);


    }

    public static int bc(int[] piles, int h){
        int start = 1;
        int end = Integer.MAX_VALUE;
        while(start<=end){
            int mid = start + (end-start)/2;
            int hr = findHours(piles, mid, h);
            if(hr>h){
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }
        return start;
    }
    public static int findHours(int[] piles, int k, int h){
        int hours = 0;
        for(int i = 0;i< piles.length;i++){
            int dic = piles[i]/k;
            hours += dic;
            if(piles[i]%k!=0)
                hours++;
        }
        return hours;
    }


    public static void main(String[] args){
        int[] arr = {1,5,2, 4, 1};
        //System.out.println((arr));

    }

}
