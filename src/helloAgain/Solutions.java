package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    List<List<Integer>> graph = new ArrayList<>();

    public long countPairs(int n, int[][] edges) {
        long sum = n;
        long totalSum = 0;

        boolean[] visited = new boolean[n];
        for(int i =0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        for(int i = 0;i<n;i++){
            if(!visited[i]){
                int ans = dfs(visited, i, new int[1]);
                sum -= ans;
                totalSum += sum*ans;
            }
        }
        return totalSum;
    }

    public int dfs(boolean[] visited, int i, int[] count){
        visited[i] = true;
        count[0]++;
        for(int curr: graph.get(i)){
            dfs(visited, curr, count);
        }
        return count[0];
    }





    public static void main(String[] args){

        int n = 6;
        int[][] connections = {{0,1},{1,3},{2,3},{4,0},{4,5}};
        //System.out.println(minReorder(n, connections));

    }

}
