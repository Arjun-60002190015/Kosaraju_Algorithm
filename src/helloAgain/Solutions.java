package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums, (String a, String b) -> {
            if(a.length()==b.length()){
                return b.compareTo(a);
            }
            return b.length() - a.length();
        });
        return nums[k-1];



    }


    public static void main(String[] args){

        int[] nums = {-5, 8, -14, 2, 4, 12};
        //System.out.println(maxSub(nums, -5));

    }

}
