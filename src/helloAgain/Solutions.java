package helloAgain;

import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total = 0;
        int min = 0;
        for(int i = 0, curr = 0;i<n;i++){
            total += cardPoints[i];
            curr += cardPoints[i];
            if(i<n-k)min += cardPoints[i];
            else{
                curr -= cardPoints[i-(n-k)];
                min = Math.min(min, curr);
            }
        }
        return total-min;
    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
