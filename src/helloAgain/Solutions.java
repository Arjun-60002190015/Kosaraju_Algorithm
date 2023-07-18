package helloAgain;


import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    //Brute Force

    public static int arrangeCoinsBF(int n) {
        if(n==1)
            return 1;
        int count = 0;
        int sum = n;
        for(int i = 1;i<n;i++){
            if((sum -i)>0){
                sum -= i;
                count++;
            }else break;
        }
        return count;

    }

    public int arrangeCoins(int n) {
        long start  = 0;
        long end = n;
        while(start<=end){
            long mid = start + (end-start)/2;
            if((mid*(mid+1))/2>n){
                end = mid-1;
            }else if((mid*(mid+1))/2<n){
                start = mid+1;
            }else return (int)mid;
        }
        return (int)end;

    }




    public static void main(String[] args){

        //System.out.println(arrangeCoins(3));

    }

}
