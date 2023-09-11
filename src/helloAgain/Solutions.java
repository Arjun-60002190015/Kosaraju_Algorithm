package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;

        int[] col = new int[n];
        Arrays.fill(col, -1);

        for(int i = 0;i<n;i++){
            if(col[i]==-1){
                if(!helper(graph, i, 0, col)) return false;
            }
        }
        return true;

    }

    public boolean helper(int[][] graph, int i, int color, int[] col){
        col[i] = color;

        for(int j:graph[i]) {
            if(col[j]==-1){
                if(!helper(graph, j, 1-color, col)) return false;
            }else if(col[j]==color) return false;
        }
        return true;

    }




    public static void main(String[] args){
        //int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int[] nums = {3, 4, 9, 1, 3, 9, 5};
        //System.out.println(canBeEqual("cmpr", "rmcp"));
    }

}
