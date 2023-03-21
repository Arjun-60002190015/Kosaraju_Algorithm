package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public long getDescentPeriods(int[] prices) {
        long count = 1;
        long ans = 1;
        int n = prices.length;

        for(int i = 1;i< prices.length;i++){
            if(prices[i] - prices[i+1]==1){
                count++;

            }else{
                count = 1;
            }
            ans += count;
        }
        return ans;


    }




    public static void main(String[] args){

        int[] nums = {-5, 8, -14, 2, 4, 12};
        //System.out.println(maxSub(nums, -5));

    }

}
