package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    int min = Integer.MAX_VALUE;
    public int getMinDistance(int[] nums, int target, int start) {
        int min = Integer.MAX_VALUE;
        int index = -1;
        for(int i = 0;i< nums.length;i++){
            if(nums[i]==target){
                index = i;
                min = Math.min(min, Math.abs(index - start));
            }
        }
        return min;
    }



    public static void main(String[] args){

        int[] nums = {-5, 8, -14, 2, 4, 12};
        //System.out.println(maxSub(nums, -5));

    }

}
