package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {
    public int maximalNetworkRank(int n, int[][] roads) {
        HashMap<Integer, HashSet<Integer>> graph = new HashMap<>();
        for(int i = 0;i<n;i++){
            graph.put(i, new HashSet<>());
        }
        int m = roads.length;
        for(int i = 0;i<m;i++){
            graph.get(roads[i][0]).add(roads[i][1]);
            graph.get(roads[i][1]).add(roads[i][0]);
        }
        int max = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i==j) continue;
                int temp = 0;
                if(graph.get(i).contains(j)) temp--;
                temp += graph.get(i).size() + graph.get(j).size();
                max = Math.max(temp, max);
            }
        }
        return max;

    }



    public static void main(String[] args){
        int[] nums = {4, 5, 2, 1};
        int[] quesries = {3, 10, 21};
        //System.out.println()
    }

}
