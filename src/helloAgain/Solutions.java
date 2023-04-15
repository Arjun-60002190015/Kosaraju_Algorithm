package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {

    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int cost = 0;
        if(homePos[0]>startPos[0]){
            int i = startPos[0] + 1;
            while(i<=homePos[0]){
                cost += rowCosts[i];
                i++;
            }
        }

        if(homePos[0]<startPos[0]){
            int i =startPos[0] - 1;
            while(i>=homePos[0]){
                cost += rowCosts[i];
                i--;
            }
        }

        if(startPos[1]<homePos[1]){
            int i = startPos[1] + 1;
            while(i<=homePos[1]){
                cost += colCosts[i];
                i++;
            }
        }

        if(startPos[1]>homePos[1]){
            int i = startPos[1] - 1;
            while(i>=homePos[1]){
                cost += colCosts[i];
                i--;
            }
        }
        return cost;


    }


    public static void main(String[] args){
        int[] nums = {10, 2};

        //System.out.println(largestNumber(nums));

    }

}
