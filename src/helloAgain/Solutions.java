package helloAgain;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {

    public static int minOperations(int n) {
        int count = 0;

        for(int i = 1;i<n;i+=2){
            count += n - i;
        }
        return count;

    }




    public static void main(String[] args){

        int[] nums = {-2};
        System.out.println(minOperations(3));

    }

}
