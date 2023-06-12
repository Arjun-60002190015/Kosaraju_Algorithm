package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {

    public long matrixSumQueries(int n, int[][] queries) {
        boolean[] col = new boolean[n];
        boolean[] row = new boolean[n];
        int rowC = 0;
        int colC = 0;
        long sum = 0;
        for(int i = queries.length-1;i>=0;i--){
            int val = queries[i][2];
            int type = queries[i][0];
            int index = queries[i][1];

            if(type==0 && !row[index]){
                rowC++;
                row[index] = true;
                sum += (n-colC)*val;
            }

            if(type==1 && !col[index]){
                colC++;
                col[index] = true;
                sum += (n-rowC)*val;
            }
        }
        return sum;



    }


    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
