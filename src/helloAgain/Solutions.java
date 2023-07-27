package helloAgain;


import javafx.scene.layout.Priority;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.sql.Array;
import java.util.*;



public class Solutions {

    public long maxRunTime(int n, int[] batteries) {
        long start = 1;
        long end = 0;
        for(int i:batteries){
            end += i;
        }
        long ans = 0;
        while(start<=end){
            long mid = start + (end-start)/2;
            if(helper(n, batteries, mid)){
                ans = mid;
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return ans;

    }

    public boolean helper(int n, int[] batteries, long mid){
        long sum = 0;
        for(int i=  0;i< batteries.length;i++){
            if(batteries[i]<=mid){
                sum += batteries[i];
            }else{
                sum += mid;
            }

        }
        return sum >=mid*n;
    }

    public static void main(String[] args){

        //System.out.println(checkPossibility(new int[]{3, 4, 2, 3}));
    }

}
