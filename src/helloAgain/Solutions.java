package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    public int getLastMoment(int n, int[] left, int[] right) {
        int max = 0;
        for(int i = 0;i< left.length;i++){
            max = Math.max(max, left[i] - 0);
        }
        for(int i = 0;i<right.length;i++){
            max = Math.max(max, n - right[i]);
        }
        return max;

    }


    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
