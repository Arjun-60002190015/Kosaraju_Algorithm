package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {


    public boolean isMonotonic(int[] nums) {
        int forw = 0;
        int back = 0;
        for(int i = 1;i< nums.length;i++){
            if(nums[i]>=nums[i-1])
                forw++;
            if(nums[i]<=nums[i-1])
                back++;
        }
        return forw== nums.length-1 || back== nums.length-1;

    }


    public static void main(String[] args){
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        //System.out.println(minPathSum(grid));

    }

}
