package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res=  new ArrayList<>();
        if(matrix.length==0 || matrix[0].length==0)
            return res;
        int top = 0;
        int left = 0;
        int right = matrix.length;
        int bottom = matrix[0].length;

        while(true){
            for(int i = left;i<=right;i++){
                res.add(matrix[top][i]);
                top++;

                if(left>right || top>bottom)
                    break;
            }

            for(int i = top;i<=bottom;i++){
                res.add(matrix[i][right]);
                right--;

                if(left>right || top>bottom)
                    break;
            }

            for(int i = right;i>=left;i--){
                bottom--;
                res.add(matrix[bottom][i]);
                if(left>right || top>bottom)
                    break;
            }

            for(int i = bottom;i>=top;i--){
                left++;
                res.add(matrix[i][left]);
                if(left>right || top>bottom)
                    break;
            }
            return res;
        }


    }
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};

    }

}
