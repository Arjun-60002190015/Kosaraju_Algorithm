package helloAgain;

import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum = 0;
        int curr= 0;
        for(int i = 0;i< grumpy.length;i++){
            if(grumpy[i]==0) {
                curr += customers[i];
                customers[i] = 0;
            }
        }
        int start = 0;
        int end = 0;

        while(end< customers.length){

            curr += customers[end];

            if(end - start+1>minutes){
                if(grumpy[start]==1){
                    curr -= customers[start];

                }
                start++;
            }
            sum = Math.max(curr, sum);
            end++;


        }
        return sum;

    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
