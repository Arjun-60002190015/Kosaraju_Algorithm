package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;
import javafx.util.Pair;
import netscape.security.UserTarget;

import java.util.*;



public class Solutions {

    int[][] dist = new int[105][105];
    int[] dx = {0, 1, -1, 0};
    int[] dy = {1, 0, 0, -1};

    public int minimumEffortPath(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        for(int i = 0;i<rows;i++){
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }
        return helper(heights);

    }

    public int helper(int[][] heights){
        int rows = heights.length;
        int cols = heights[0].length;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(-a[0], -b[0]));
        pq.add(new int[]{0, 0, 0});
        dist[0][0] = 0;
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int cost = -curr[0];
            int x = curr[1];
            int y = curr[2];
            if(cost>dist[x][y]) continue;
            if(x==rows-1 && y==cols-1) return cost;
            for(int i = 0;i<4;i++){
                int newx = x + dx[i];
                int newy = y + dy[i];
                if(newx<0 || newx>=rows || newy<0 || newy>=cols) continue;
                int newdist = Math.max(dist[x][y], Math.abs(heights[x][y] - heights[newx][newy]));
                if(newdist<dist[newx][newy]){
                    dist[newx][newy] = newdist;
                    pq.add(new int[]{-newdist, newx, newy});
                }
            }

        }
        return dist[rows-1][cols-1];

    }




    public static void main(String[] args){
        //int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        int[][] nums = {{2}, {3},  {4, 5}, {2}, {}};
        //System.out.println(kahnAlgo(nums));
    }

}
