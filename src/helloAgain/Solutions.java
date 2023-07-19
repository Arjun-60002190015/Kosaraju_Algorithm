package helloAgain;


import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int findMinArrowShots(int[][] points) {
        int count = 1;
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int prev = points[0][1];
        for(int i = 1;i< points.length;i++){
            if(points[i][0]<=prev){
                continue;
            }else {
                prev = points[i][1];
                count++;
            }
        }
        return count;

    }




    public static void main(String[] args){

        //System.out.println(arrangeCoins(3));

    }

}
