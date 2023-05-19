package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {


    public boolean isBipartite(int[][] graph) {
        int[] colors = new int[graph.length];

        for(int i = 0;i< graph.length;i++){
            if(colors[i]==0 && helper(graph, colors, i, 1))
                return false;
        }
        return true;

    }

    public boolean helper(int[][] graph, int[] colors, int node, int c){
        if(colors[node]!=0)
            return colors[node]==c;

        colors[node] = c;

        for(int n:graph[node]){
            if(!helper(graph, colors, n, -c))
                return false;
        }
        return true;
    }




    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};

    }

}
