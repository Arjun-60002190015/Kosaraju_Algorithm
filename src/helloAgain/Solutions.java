package helloAgain;


import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int start = Integer.MAX_VALUE;
        int end = position[position.length-1]-position[0];
        for(int i = 1;i<position.length;i++){
            start = Math.min(start, position[i]-position[i-1]);
        }

        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(helper(mid, position, m)){
                ans = mid;
                start = mid+1;
            }else end = mid-1;
        }
        return ans;

    }

    public boolean helper(int max, int[] position, int m){
        int count = 1;
        int prev = position[0];
        for(int i = 1;i<position.length;i++){
            if(position[i]-prev>=max){
                prev = position[i];
                count++;
            }
        }
        return count>=m;
    }




    public static void main(String[] args){

        //System.out.println(arrangeCoins(3));

    }

}
