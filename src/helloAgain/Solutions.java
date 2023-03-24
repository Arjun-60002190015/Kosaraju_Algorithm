package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {

    public static int minReorder(int n, int[][] connections) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] con:connections){
            graph.get(con[0]).add(con[1]);
            graph.get(con[1]).add(-con[0]);
        }
        return dfs(graph, new boolean[n], 0);

    }

    public static int dfs(List<List<Integer>> graph, boolean[] visited, int root){
        int count = 0;
        visited[root] = true;
        for(int i: graph.get(root)){
            if(!visited[Math.abs(i)]){
                count += dfs(graph, visited, Math.abs(i)) + ((i>0)?1:0);
            }
        }
        return count;
    }



    public static void main(String[] args){

        int n = 6;
        int[][] connections = {{0,1},{1,3},{2,3},{4,0},{4,5}};
        //System.out.println(minReorder(n, connections));

    }

}
