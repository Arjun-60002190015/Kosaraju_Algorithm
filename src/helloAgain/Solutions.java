package helloAgain;


import javafx.scene.layout.Priority;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int longestMountain(int[] arr) {
        int [] fromright=new int[arr.length];
        fromright[arr.length-1]=0;
        int []fromleft=new int[arr.length];
        fromleft[0]=0;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                fromright[i]=fromright[i+1]+1;
            }
            else{
                fromright[i]=0;
            }
        }

        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                fromleft[i]=fromleft[i-1]+1;
            }
            else{
                fromleft[i]=0;
            }
        }
        int res=0;
        for(int i=0;i<arr.length;i++){
            if(fromleft[i]>=1 && fromright[i]>=1) {
                res = Math.max(res, fromleft[i] + fromright[i]);
            }
        }
        if(res==1 || res==0){
            return 0;
        }
        return res+1;
    }


    public static void main(String[] args){

        //System.out.println(minSpeedOnTime(new int[]{1, 3, 2}, 1.9));
    }

}
