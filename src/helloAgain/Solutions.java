package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public static int[] findColumnWidth(int[][] grid) {
        int[] res = new int[grid[0].length];
        int RI = 0;
        int index = 0;
        int max = 0;
        while(index<grid[0].length){
            for(int i = 0;i< grid.length;i++){
                if(digits(grid[i][index])>max)
                    max = digits(grid[i][index]);
            }
            res[RI] = max;
            RI++;
            max = 0;
            index++;
        }
        return res;


    }

    public static int digits(int n){
        if(n==0)
            return 1;
        int count = 0;
        int k = Math.abs(n);
        while(k!=0){
            k = k/10;
            count++;
        }
        if(n<0)
            return count+1;
        return count;
    }


    public static void main(String[] args){
        int[] nums = {2, 3, 7, 5, 10};

        //System.out.println(largestNumber(nums));

    }

}
