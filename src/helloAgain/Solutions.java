package helloAgain;


import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });

        int count = 0;
        int end = -100000;
        for(int[] i:intervals){
            if(i[0]>=end)
                end = i[1];
            else count++;
        }
        return count;

    }




    public static void main(String[] args){

        //System.out.println(arrangeCoins(3));

    }

}
