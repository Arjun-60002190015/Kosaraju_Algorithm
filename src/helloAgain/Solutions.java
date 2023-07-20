package helloAgain;


import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public long minimumPerimeter(long neededApples) {
        long low = 0;
        long high = 1664510;
        while(high-low>1){
            long mid = low + (high-low)/2;
            long val = 2*mid*(mid+1)*(2*mid+1);
            if(val>=neededApples){
                high = mid;
            }
            else low = mid;
        }
        return 8 * high;

    }




    public static void main(String[] args){

        //System.out.println(arrangeCoins(3));

    }

}
