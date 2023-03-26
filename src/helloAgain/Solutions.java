package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public int longestCycle(int[] edges) {
        int res = -1;
        boolean[] vis = new boolean[edges.length];
        for(int i = 0;i< edges.length;i++){
            if(vis[i])
                continue;
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int j = 0, dist = 0;j!=-1;j=edges[j]){
                if(map.containsKey(j)){
                    res = Math.max(res, dist - map.get(j));
                    break;
                }
                if(vis[j])
                    break;
                vis[j] = true;
                map.put(j, dist++);
            }
        }
        return res;
    }






        public static void main(String[] args){

        int n = 6;
        int[][] connections = {{0,1},{1,3},{2,3},{4,0},{4,5}};
        //System.out.println(minReorder(n, connections));

    }

}
