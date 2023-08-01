package helloAgain;


import java.util.*;



public class Solutions {
    //BFS SOLUTION:
    public int minScoreBFS(int n, int[][] roads) {
        Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();
        for(int[] road:roads){
            if(!graph.containsKey(road[0])){
                graph.put(road[0], new HashMap<>());
            }
            if(!graph.containsKey(road[1])){
                graph.put(road[1], new HashMap<>());
            }
            graph.get(road[0]).put(road[1], road[2]);
            graph.get(road[1]).putIfAbsent(road[0], road[2]);
        }

        int min = Integer.MAX_VALUE;
        Set<Integer> vis = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        while(!q.isEmpty()){
            int node = q.poll();
            for(int i:graph.get(node).keySet()){
                if(!vis.contains(i)){
                    q.offer(i);
                    vis.add(i);
                }
                min = Math.min(min, graph.get(node).get(i));
            }
        }
        return min;

    }

    // DFS SOLUTION:
    public int minScore(int n, int[][] roads) {
        List<int[]>[] graph = new List[n+1];
        int min = Integer.MAX_VALUE;
        boolean[] vis = new boolean[n+1];
        vis[1] = true;
        for(int i = 0;i<n+1;i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] road:roads){
            graph[road[0]].add(new int[]{road[1], road[2]});
            graph[road[1]].add(new int[]{road[0], road[2]});
        }
        helper(1, min, vis, graph);
        return min;

    }

    public void helper(int curr, int min, boolean[] vis, List<int[]>[] graph){
        for(int[] i:graph[curr]){
            int next = i[0];
            int dist = i[1];
            min = Math.min(min, dist);
            if(!vis[next]){
                vis[next] = true;
                helper(next, min, vis, graph);
            }
        }
    }



    public static void main(String[] args){
        //System.out.println(dividePlayers(new int[]{3, 2, 5, 1, 3, 4}));

    }

}
