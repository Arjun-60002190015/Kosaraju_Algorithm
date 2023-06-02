package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    int count = 0;
    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length;
        int ans = 0;
        for(int i = 0;i<n;i++){
            count = 0;
            dfs(i, new boolean[n], bombs);
            ans = Math.max(ans, count);
        }
        return ans;

    }

    public void dfs(int index, boolean[] v, int[][] bombs){
        count++;
        v[index] = true;
        int n = bombs.length;
        for(int i = 0;i<n;i++){
            if(!v[i] && inRange(bombs[index], bombs[i])){
                v[i] = true;
                dfs(i, v, bombs);
            }
        }
    }

    public boolean inRange(int[] a, int[] b){
        long x = a[0] - b[0];
        long y = a[1] - b[1];
        long r = a[2];
        return x*x + y*y <= r*r;
    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
