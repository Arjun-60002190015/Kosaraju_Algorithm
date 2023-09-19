package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;
import netscape.security.UserTarget;

import java.util.*;



public class Solutions {

    public int[] shortestPath(int[][] edges, int n, int m, int src) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0;i<n;i++) graph.add(new ArrayList<>());
        for(int i= 0;i<m;i++){
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }

        int[] dist = new int[n];
        for(int i = 0;i<n;i++){
            dist[i] = (int)1e9;
        }
        dist[src] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()){
            int node = q.poll();
            for(int i:graph.get(node)){
                if(dist[node] + 1<dist[i]){
                    dist[i] = dist[node]+1;
                    q.add(i);
                }
            }
        }
        //below code only to return -1:
        for(int i = 0;i<n;i++){
            if(dist[i]==1e9) dist[i] = -1;
        }
        return dist;


    }




    public static void main(String[] args){
        //int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int[][] nums = {{2}, {3},  {4, 5}, {2}, {}};
        //System.out.println(kahnAlgo(nums));
    }

}
