package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;
import com.sun.javafx.image.IntPixelGetter;
import javafx.util.Pair;
import netscape.security.UserTarget;

import java.util.*;



public class Solutions {
    //Function to find number of strongly connected components in the graph:
    public int kosaraju(int v, List<List<Integer>> graph){
        int[] vis = new int[v];
        Stack<Integer> stack = new Stack<>();
        //Ordering and putting in the Stack:
        for(int i = 0;i<v;i++){
            if(vis[i]==0) dfs(i, vis, graph, stack);
        }
        //Reversing the connections:
        List<List<Integer>> grap = new ArrayList<>();
        for(int i = 0;i<v;i++){
            vis[i] = 0;
            for(Integer j: grap.get(i)){
                grap.get(j).add(i);
            }
        }
        //Counting the SCCs:
        int scc = 0;
        while(!stack.isEmpty()){
            int node = stack.peek();
            stack.pop();
            if(vis[node]==0){
                scc++;
                helper2(node, vis, grap);
            }
        }
        return scc;
    }

    public void dfs(int node, int[] vis, List<List<Integer>> graph, Stack<Integer> stack){
        vis[node] = 1;
        for(Integer j:graph.get(node)){
            if(vis[j]==0) dfs(j, vis, graph, stack);
        }
        stack.push(node);
    }

    public void helper2(int node, int[] vis, List<List<Integer>> graph){
        vis[node] = 1;
        for(Integer j:graph.get(node)){
            if(vis[j]==0) helper2(j, vis, graph);
        }
    }




    public static void main(String[] args){
        //System.out.println(backspaceCompare(new String("ab#c"), new String("ad#c")));
    }

}
