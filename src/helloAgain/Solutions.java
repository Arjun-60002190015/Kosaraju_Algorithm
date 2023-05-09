package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {

    public int brokenCalc(int startValue, int target) {
        if(startValue>=target)
            return startValue - target;
        if(target%2==0)
            return brokenCalc(startValue, target/2);
        return brokenCalc(startValue, target-1);

    }


    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};


        //System.out.println(maxOperations(nums, 5));

    }

}
