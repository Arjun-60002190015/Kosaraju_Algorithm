package helloAgain;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for(int i = 0;i<startTime.length;i++){
            if(endTime[i] - startTime[i]==queryTime)
                count++;
        }
        return count;

    }




    public static void main(String[] args){

        int[] nums = {-2, -3, 0};
        //System.out.println(maxScore(nums));

    }

}
