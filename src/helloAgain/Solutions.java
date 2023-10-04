package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;
import javafx.util.Pair;
import netscape.security.UserTarget;

import java.util.*;



public class Solutions {

    public int[] bellman_ford(int n, int[][] graph, int s){
        int[] dist = new int[n];
        for(int i = 0;i<n;i++) dist[i] = (int)1e8;
        dist[s] = 0;
        //Relaxation for n-1 times -
        for(int i = 0;i<n-1;i++){
            for(int[] j:graph){
                int u = j[0];
                int v = j[1];
                int wt = j[2];
                if(dist[u]!=(int)1e8 && dist[u] + wt < dist[v]){
                    dist[v] = dist[u] + wt;
                }

            }
        }
        //Relaxation now for n-th iteration and if value further reduces then there's
        //Negative Cycle
        for(int[] j:graph){
            int u = j[0];
            int v = j[1];
            int wt = j[2];
            if(dist[u]!=(int)1e8 && dist[u] + wt < dist[v]){
                return new int[]{-1};
            }
        }
        return dist;
    }




    public static void main(String[] args){
        //int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(2);

        //System.out.println(winnerOfGame(new String("AAABABB")));
    }

}
