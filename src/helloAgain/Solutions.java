package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int[][] transpose(int[][] matrix) {
        int[][] res = new int[matrix[0].length][matrix.length];
        for(int i = 0;i< matrix.length;i++){
            for(int j = 0;j< matrix[i].length;j++){
                res[i][j] = matrix[j][i];
            }
        }
        return res;

    }


    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
