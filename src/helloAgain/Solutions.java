package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public int findSpecialIntegerExtraSpace(int[] arr) {
        int[] freq = new int[100001];
        for(int i:arr){
            freq[i]++;
        }
        for(int i = 0;i< freq.length;i++){
            if(freq[i]>arr.length/4)
                return i;
        }
        return -1;

    }
    public int findSpecialInteger(int[] arr) {
        int count = 0;
        int prev = -1;
        int req = arr.length/4;
        for(int i:arr){
            if(i==prev)
                count++;
            else{
                count = 1;
                prev = i;
            }
            if(count>req)
                return i;
        }
        return -1;

    }





    public static void main(String[] args){

        int n = 6;
        int[][] connections = {{0,1},{1,3},{2,3},{4,0},{4,5}};
        //System.out.println(minReorder(n, connections));

    }

}
