package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int findLongestChain(int[][] pairs) {

        int count = 1;
        int prev = pairs[0][1];
        Arrays.sort(pairs, (a, b) -> {return a[0] - b[0];});
        for(int i = 1;i< pairs.length;i++){
            if(prev<pairs[i][0]) {
                prev = pairs[i][1];
                count++;
            }else{
                prev = Math.min(prev, pairs[i][1]);
            }
        }
        return count;

    }


    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};

    }

}
