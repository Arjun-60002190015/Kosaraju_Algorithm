package helloAgain;


import javafx.scene.layout.Priority;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public static int minSpeedOnTime(int[] dist, double hour) {
        int start = 1;
        int end = (int)1e7;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(helper(mid, hour, dist)){
                ans = mid;
                end = mid-1;
            }else start = mid+1;
        }
        return ans;
    }

    public static boolean helper(int given, double target, int[] dist){
        double sum = 0;
        for(int i = 0;i< dist.length;i++){
            double f = dist[i]*1.0/given;
            if(i!=dist.length-1){
                sum += Math.ceil(f);
            }else sum += f;
        }
        return sum<=target;
    }


    public static void main(String[] args){

        System.out.println(minSpeedOnTime(new int[]{1, 3, 2}, 1.9));
    }

}
