package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    boolean visited[][];
    int n;

    public int shortestBridge(int[][] grid) {
        n = grid.length;
        visited = new boolean[n][n];

        Queue<int[]> queue = new ArrayDeque<>();
        boolean flag = false;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j]==1) {
                    dfs(i, j, grid, queue);
                    flag = true;
                    break;
                }
            }
            if(flag)
                break;
        }
        return bfs(grid, queue);
    }

    public void dfs(int i, int j, int[][] grid, Queue<int[]> queue){
        if(i==-1 || j==-1 || i>=n || j>=n || visited[i][j])
            return;

        visited[i][j] = true;
        if(grid[i][j]==0) {
            queue.add(new int[]{i, j});
            return;
        }

        dfs(i-1, j, grid, queue);
        dfs(i+1, j, grid, queue);
        dfs(i, j-1, grid, queue);
        dfs(i, j+1, grid, queue);
    }

    public int bfs(int[][] grid, Queue<int[]> queue){
        int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size-->0){
                int[] curr = queue.remove();
                int i = curr[0];
                int j = curr[1];
                if(grid[i][j] == 1)
                    return level;

                if(i+1<n && !visited[i+1][j]){
                    queue.add(new int[]{i+1, j});
                    visited[i+1][j] = true;
                }

                if(i-1>=0 && !visited[i-1][j]){
                    queue.add(new int[]{i-1, j});
                    visited[i-1][j] = true;
                }

                if(j+1<n && !visited[i][j+1]){
                    queue.add(new int[]{i, j+1});
                    visited[i][j+1] = true;
                }

                if(j-1>=0 && !visited[i][j-1]){
                    queue.add(new int[]{i, j-1});
                    visited[i][j-1] = true;
                }
            }
            level++;
        }
        return level;
    }






    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};

    }

}
