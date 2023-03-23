package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {

    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1){
            return -1;
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int[] con:connections){
            map.computeIfAbsent(con[0], k -> new ArrayList<>()).add(con[1]);
            map.computeIfAbsent(con[1], k -> new ArrayList<>()).add(con[0]);
        }
        int count = 0;
        boolean[] visited = new boolean[n];
        for(int i = 0;i<n;i++){
            if(!visited[i]){
                count++;
                dfs(i, map, visited);
            }
        }
        return count - 1;

    }

    public void dfs(int i, Map<Integer, List<Integer>> map, boolean[] visted){
        visted[i]  = true;
        if(!map.containsKey(i))
            return;
        for(int neighbour:map.get(i)){
            if(!visted[neighbour]){
                visted[neighbour] = true;
                dfs(neighbour, map, visted);
            }
        }
    }



    public static void main(String[] args){

        int[] nums = {-5, 8, -14, 2, 4, 12};
        //System.out.println(maxSub(nums, -5));

    }

}
