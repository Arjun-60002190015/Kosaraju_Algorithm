package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        for(int i = 0;i< spells.length;i++){
            long curr = spells[i];
            spells[i] = binaryS(spells[i], potions, success);
        }
        return spells;


    }

    public static int binaryS(int i, int[] potions, long success){
        int start = 0;
        int end = potions.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(potions[mid]*i>= success){
                end = mid - 1;
            }
            else{
                start = mid+1;
            }
        }
        return potions.length - start;
    }



    public static void main(String[] args){
        int[] spells = {5, 1, 3};
        int[] potions = {1, 2, 3, 4, 5};
        System.out.println(successfulPairs(spells, potions, 7));

    }

}
