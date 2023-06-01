package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {

    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid==null || grid.length==0 || grid[0].length==0)
            return -1;

        int ans = 0;
        int row = grid.length;
        int col = grid[0].length;
        if(grid[0][0]==1 || grid[row-1][col-1]==1)
            return -1;

        int[][] directions = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1},
                {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        boolean[][] visited = new boolean[row][col];

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        visited[0][0] = true;
        int len = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            len++;
            for(int i = 0;i<len;i++){
                int[] curr = queue.poll();
                if(curr[0]==row-1 && curr[1]==col-1)
                    return len;

                for(int[] dir:directions){
                    int x = curr[0]+dir[0];
                    int y = curr[1] + dir[1];

                    if(x<0 || x>=row || y<0 || y>=col || visited[x][y]
                    || grid[x][y]==1)
                        continue;

                    visited[x][y] = true;
                    queue.offer(new int[]{x, y});
                }
            }
        }
        return -1;

    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
