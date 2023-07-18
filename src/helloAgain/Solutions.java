package helloAgain;


import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public boolean isPerfectSquare(int num) {
        if(num==1)
            return true;
        long start = 0;
        long end = num/2;
        while(start<=end){
            long mid = start + (end-start)/2;
            if(mid*mid>num){
                end = mid-1;
            }else if(mid*mid<num){
                start = mid+1;
            }else return true;
        }
        return false;

    }




    public static void main(String[] args){

        //System.out.println(arrangeCoins(3));

    }

}
