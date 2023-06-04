package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    // DFS Solution
    public boolean canVisitAllRoomsDFS(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        helper(0, rooms, visited);
        for(int i = 0;i<n;i++){
            if(!visited[i])
                return false;
        }
        return true;

    }

    public void helper(int index, List<List<Integer>> rooms, boolean[] visited){
        if(visited[index] || index== visited.length)
            return;
        visited[index] = true;
        for(int key:rooms.get(index))
            helper(key, rooms, visited);
    }

    //BFS Solution

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> set = new HashSet<>();
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.offer(rooms.get(0));
        set.add(0);
        while(!queue.isEmpty()){
            List<Integer> room = queue.poll();
            for(int r:room){
                queue.offer(rooms.get(r));
                set.add(r);
            }
        }
        return set.size()== rooms.size();
    }


        public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
