package helloAgain;


import javafx.scene.layout.Priority;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.sql.Array;
import java.util.*;



public class Solutions {

    public int maxAscendingSum(int[] nums) {
        int curr = nums[0];
        int max = curr;

        for(int i = 1;i< nums.length;i++){
            if(nums[i]>nums[i-1]){
                curr += nums[i];
            }else{
                if(max>curr){
                    max = curr;
                }
                curr = nums[i];
            }
        }
        if(max<curr){
            max = curr;
        }
        return max;

    }


    public static void main(String[] args){

        //System.out.println(checkPossibility(new int[]{3, 4, 2, 3}));
    }

}
