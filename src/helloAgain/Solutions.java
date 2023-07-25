package helloAgain;


import javafx.scene.layout.Priority;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public static boolean validMountainArray(int[] arr) {
        if(arr.length<=2) return false;
        int max = arr[0];
        int index = 0;
        for(int i = 0;i< arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        if(index==0 || index==arr.length-1) return false;
        int i = 0;
        while(i<index){
            if(arr[i]>=arr[i+1]) return false;
            i++;
        }
        while(index< arr.length-1){
            if(arr[index]<=arr[index+1]) return false;
            index++;
        }
        return true;

    }
    public static void main(String[] args){
        System.out.println(validMountainArray(new int[]{0, 3, 2, 1}));
    }

}
