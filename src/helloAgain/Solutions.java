package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;
import netscape.security.UserTarget;

import java.util.*;



public class Solutions {

    public static int[] topoSort(int[][] graph){
        int n = graph.length;

        int[] vis = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<n;i++){
            if(vis[i]==0){
                helper(graph, i, vis, st);
            }
        }
        int[] res = new int[n];
        int i = 0;
        while(!st.isEmpty()){
            res[i++] = st.peek();
            st.pop();
        }
        return res;
    }

    public void helper(int[][] graph, int i, int[] vis, Stack<Integer> st){
        vis[i] = 1;
        for(int j:graph[i]){
            if(vis[j]==0)
                helper(graph, j, vis, st);
        }
        st.push(i);
    }




    public static void main(String[] args){
        //int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int[] nums = {3, 4, 9, 1, 3, 9, 5};
        //System.out.println(canBeEqual("cmpr", "rmcp"));
    }

}
