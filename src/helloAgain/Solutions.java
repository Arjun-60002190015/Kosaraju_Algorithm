package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;
import javafx.util.Pair;
import netscape.security.UserTarget;

import java.util.*;



public class Solutions {

    //Dijkstra Algo:
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();
        for(int[] edge:edges){
            if(!graph.keySet().contains(edge[0]))
                graph.put(edge[0], new HashMap<>());
            graph.get(edge[0]).put(edge[1], edge[2]);
            if(!graph.keySet().contains(edge[1]))
                graph.put(edge[1], new HashMap<>());
            graph.get(edge[1]).put(edge[0], edge[2]);
        }

        int min = Integer.MAX_VALUE;
        int res = -1;

        for(int i = 0;i<n;i++){
            Queue<int[]> pq = new PriorityQueue<>((a,b) -> (Integer.compare(a[1], b[1])));
            boolean[] vis = new boolean[n];
            int count = 0;
            pq.add(new int[]{i, 0});
            while(!pq.isEmpty()){
                int[] curr = pq.poll();
                int node = curr[0];
                int dis = curr[1];

                if(vis[node]) continue;
                vis[node] = true;
                count++;
                if(graph.keySet().contains(node)){
                    for(int adj:graph.get(node).keySet()){
                        if(!vis[adj] && dis + graph.get(node).get(adj) <= distanceThreshold)
                            pq.add(new int[] {adj, dis + graph.get(node).get(adj)});
                    }
                }
            }
            if(count-1 <=min){
                min = count-1;
                res = i;
            }


        }
        return res;


    }
    // Floyd Warshall Algo:

    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dist = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
        for(int i = edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            dist[u][v] = wt;
            dist[v][u] = wt;
        }
        for(int i = 0;i<n;i++) dist[i][i] = 0;
        for(int k = 0;k<n;k++){
            for(int i = 0;i<n;i++){
                for(int j = 0;j<n;j++){
                    if(dist[i][k]==Integer.MAX_VALUE || dist[k][j]==Integer.MAX_VALUE) continue;
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }

        }
        int count = n;
        int max = -1;
        for(int i = 0;i<n;i++){
            int temp = 0;
            for(int j = 0;j<n;j++){
                if(dist[i][j]<=distanceThreshold){
                    temp++;
                }
            }
            if(temp<=count){
                count = temp;
                max = i;
            }
        }
        return max;

    }




    public static void main(String[] args){


        System.out.println(getPhoneNumber(new String("five one zero two four eight zero double three two")));
    }

}
