package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {

    public boolean isCyclic(int v, int[][] graph){
        int[] vis = new int[v];
        int[] path = new int[v];
        for(int i = 0;i<v;i++){
            if(vis[i]==0){
                if(helper(i, graph, vis, path)) return true;
            }
        }
        return false;
    }

    public boolean helper(int i, int[][] graph, int[] vis, int[] path){
        path[i] = 1;
        vis[i] = 1;

        for(int j:graph[i]){
            if(vis[j]==0){
                if(helper(j, graph, vis, path)) return true;
            }else if(path[j]==1) return true;
        }
        return false;
    }




    public static void main(String[] args){
        //int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int[] nums = {3, 4, 9, 1, 3, 9, 5};
        //System.out.println(canBeEqual("cmpr", "rmcp"));
    }

}
