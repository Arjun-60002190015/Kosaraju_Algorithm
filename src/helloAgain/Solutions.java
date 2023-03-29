package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {


    public static int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int sum = 0;
        for(int i = 0;i<satisfaction.length;i++){
            int index = 1;
            int temp = 0;
            for(int j = i;j<satisfaction.length;j++){
                temp += satisfaction[j] * index;
                index++;
            }
            sum = Math.max(temp, sum);
        }
        return sum;

    }


    public static void main(String[] args){
        int[] nums = {-1, -8, 0, 5, -9};
        System.out.println(maxSatisfaction(nums));

    }

}
