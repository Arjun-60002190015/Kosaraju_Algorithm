package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {
    long ans = 0;
    public long minimumFuelCost(int[][] roads, int seats) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0;i< roads.length;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] r:roads){
            graph.get(r[0]).add(r[1]);
            graph.get(r[1]).add(r[0]);
        }
        dfs(0, -1, graph, seats);
        return ans;

    }

    public int dfs(int i, int prev, List<List<Integer>> graph, int seats){
        int res = 1;
        for(int j:graph.get(i)){
            if(j==prev) continue;
            res += dfs(j, i, graph, seats);
        }

        ans += Math.ceil((double)(res/seats));
        return res;
    }



    public static void main(String[] args){
        int[] nums = {3, 4, 9, 1, 3, 9, 5};
        //System.out.println(findKDistantIndices(nums, 9, 1));
    }

}
