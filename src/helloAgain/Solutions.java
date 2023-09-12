package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;
import netscape.security.UserTarget;

import java.util.*;



public class Solutions {

    public static boolean kahnAlgo(int[][] graph){
        int n = graph.length;
        int count = 0;
        int[] inDeg = new int[n];
        for(int i = 0;i<n;i++){
            inDeg[i]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i =0;i<n;i++){
            if(inDeg[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int node = q.peek();
            q.poll();
            count++;

            for(int j:graph[node]){
                inDeg[j]--;
                if(inDeg[j]==0){
                    q.add(j);
                }
            }
        }
        return count==n;



    }




    public static void main(String[] args){
        //int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int[][] nums = {{2}, {3},  {4, 5}, {2}, {}};
        System.out.println(kahnAlgo(nums));
    }

}
