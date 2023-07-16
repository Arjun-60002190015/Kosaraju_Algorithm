package helloAgain;


import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] len = new int[1001];
        for(int[] trip:trips){
            len[trip[1]] += trip[0];
            len[trip[2]] -= trip[0];
        }
        int sum = 0;
        for(int i = 0;i<1001;i++){
            sum += len[i];
            if(sum>capacity)
                return false;

        }
        return true;

    }
    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
