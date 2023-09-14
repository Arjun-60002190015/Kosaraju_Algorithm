package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;
import netscape.security.UserTarget;

import java.util.*;



public class Solutions {

    public String alienDict(String[] dict, int n, int k){
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0;i<k;i++){
            graph.add(new ArrayList<>());
        }

        for(int i = 0;i<n-1;i++){
            String s1 = dict[i];
            String s2 = dict[i+1];
            int len = Math.min(s1.length(), s2.length());
            for(int j = 0;j<len;j++){
                if(s1.charAt(j)!=s2.charAt(j)){
                    graph.get(s1.charAt(j)-'a').add(s2.charAt(j)-'a');
                    break;
                }
            }
        }

        List<Integer> res = helper(graph, k);
        String result = "";
        for(int i = 0;i< res.size();i++){
            result += (char)(res.get(i)-'0');
        }
        return result;
    }

    public List<Integer> helper(List<List<Integer>> graph, int k){
        int[] inDeg = new int[k];
        for(int i = 0;i<k;i++){
            for(int j: graph.get(i)){
                inDeg[j]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        for(int i = 0;i<k;i++){
            if(inDeg[i]==0) q.add(i);
        }
        while(!q.isEmpty()){
            int node = q.poll();
            res.add(node);
            for(int i:graph.get(node)){
                inDeg[i]--;
                if(inDeg[i]==0) q.add(i);
            }
        }
        return res;
    }




    public static void main(String[] args){
        //int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int[][] nums = {{2}, {3},  {4, 5}, {2}, {}};
        //System.out.println(kahnAlgo(nums));
    }

}
