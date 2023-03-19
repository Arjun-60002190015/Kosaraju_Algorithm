package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public static int maxflipOne(int[] nums){
        int ans = 0;
        int j = -1;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0)
                count++;
            while(count>1){
                j++;
                if(nums[j]==0)
                    count--;
            }
            int len = i-j;
            if(len>ans)
                ans = len;
        }
        return ans;
    }




    public static void main(String[] args){

        int[] nums = {-5, 8, -14, 2, 4, 12};
        //System.out.println(maxSub(nums, -5));

    }

}
