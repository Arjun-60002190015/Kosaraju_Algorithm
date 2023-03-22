package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {


    public int minScore(int n, int[][] roads) {
        List<int[]>[] graph = new List[n+1];
        for(int i = 0;i< graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] road:roads){
            graph[road[0]].add(new int[]{road[1], road[2]});
            graph[road[1]].add(new int[]{road[0], road[2]});
        }
        int res = Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        Queue<Integer> queue = new ArrayDeque<>();
        set.add(1);
        queue.add(1);
        while(!queue.isEmpty()){
            int node = queue.poll();
            for(int[] i:graph[node]){
                res = Math.min(res, i[1]);
                if(set.add(i[0])) {
                    queue.add(i[0]);
                }
            }
        }
        return res;

    }







    public static void main(String[] args){

        int[] nums = {-5, 8, -14, 2, 4, 12};
        //System.out.println(maxSub(nums, -5));

    }

}
