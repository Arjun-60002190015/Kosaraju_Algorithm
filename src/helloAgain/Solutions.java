package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m*n];
        int index = 0;
        int i, j = 0;
        res[index++] = mat[i][j];
        boolean isUp = true;
        while(index!= res.length){
            if(isUp){
                j += 1;
                while(j!=0 && i!= m-1){
                    if(j<n){
                        res[index++] = mat[i][j];
                    }
                    i++;
                    j--;
                }
                res[index++] = mat[i][j];
                isUp = false;
            }
            else{
                i+= 1;
                while(i!=0 && j!=n-1){
                    if(i<m){
                        res[index++] = mat[i][j];
                    }
                    i--;
                    j++;
                }
                res[index++] = mat[i][j];
                isUp = true;
            }
        }
        return res;

    }


    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
