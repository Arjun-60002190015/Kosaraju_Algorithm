package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min = -1;
        int dist = Integer.MAX_VALUE;
        for(int i = 0;i<points.length;i++){
            if(points[i][0]==x ||
                    points[i][1]==y){
                if((Math.abs(points[i][0]-x)+Math.abs(points[i][1]-y))<dist){
                    dist = (Math.abs(points[i][0]-x)+Math.abs(points[i][1]-y));
                    min = i;
                }
            }
        }
        return min;

    }

    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
