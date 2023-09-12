package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;
import netscape.security.UserTarget;

import java.util.*;



public class Solutions {

    public int[] kahnAlgo(int[][] graph){
        int n = graph.length;
        int[] inDegree = new int[n];
        for(int i = 0;i<n;i++){
            for(int j:graph[i]){
                inDegree[j]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i<n;i++){
            if(inDegree[i]==0){
                q.add(i);
            }
        }
        int[] topo = new int[n];
        int i = 0;
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            topo[i++] = node;

            for(int j:graph[node]){
                inDegree[j]--;
                if(inDegree[j]==0){
                    q.add(j);
                }
            }
        }
        return topo;

    }




    public static void main(String[] args){
        //int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int[] nums = {1, 1, 2, 3, 5};
        //System.out.println(minDeletion(nu));
    }

}
