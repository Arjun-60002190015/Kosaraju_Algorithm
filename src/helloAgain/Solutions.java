package helloAgain;


import javafx.scene.layout.Priority;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for(int i = 0;i< nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
                if(count>1) return false;
                if(i>0 && nums[i-1]>nums[i+1]){
                    nums[i+1] = nums[i];
                }
            }
        }
        return true;

    }


    public static void main(String[] args){

        //System.out.println(checkPossibility(new int[]{3, 4, 2, 3}));
    }

}
