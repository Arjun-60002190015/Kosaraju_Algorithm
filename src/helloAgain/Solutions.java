package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int low = price[0];
        int high = price[price.length-1] - price[0];
        while(low<high){
            int mid = 1+ low + (high-low)/2;
            if(bs(mid, price, k)){
                low = mid;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }

    public boolean bs(int target, int[] price, int k){
        int prev = price[0];
        int count = 1;
        for(int i = 1;i< price.length;i++){
            if(price[i]-prev>=target){
                count++;
                prev = price[i];
            }
            if(count==k)
                return true;
        }
        return false;
    }




    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};

    }

}
