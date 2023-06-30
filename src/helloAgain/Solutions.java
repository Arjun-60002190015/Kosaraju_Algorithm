package helloAgain;

import com.sun.deploy.security.CredentialManager;
import com.sun.prism.shader.AlphaOne_Color_AlphaTest_Loader;
import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    // 0 - Land
    // 1 - Water

    // DFS Solution - not very optimal
    public int latestDayToCrossDFS(int row, int col, int[][] cells) {
        int res = 0;
        int[][] grid = new int[row][col];
        for(int a = 0;a< cells.length;a++){
            int x = cells[a][0];
            int y = cells[a][1];
            grid[x-1][y-1] = 1;
            boolean ispath = false;
            for(int i = 0;i<col;i++){
                if(grid[0][i]==0){
                    boolean[][] vis = new boolean[row][col];
                    ispath = helper(grid, 0, i, vis, row, col);
                }
                if(ispath) {
                    res++;
                    break;
                }

            }
            if(!ispath)
                break;
        }
        return res;

    }

    public boolean helper(int[][] grid, int i, int j, boolean[][] vis, int row, int col){
        if(i==row-1 && j==col-1 && !vis[i][j])
            return true;
        if(i<0 || j<0 || i>=row || j>=col || vis[i][j] || grid[i][j]!=0)
            return false;
        vis[i][j] = true;
        return helper(grid, i+1, j, vis, row, col) ||
                helper(grid, i-1, j, vis, row, col) ||
        helper(grid, i, j+1, vis, row, col) ||
        helper(grid, i, j-1, vis, row, col);
    }

    // This is DFS + Binary Search - it is optimized
    public int latestDayToCrossBs(int row, int col, int[][] cells) {
        int i = 1;
        int j = row*col;
        while(i<j){
            int mid = i + (j-i)/2;
            boolean[][] vis = new boolean[row][col];
            boolean isPath = false;
            for(int k = 0;k<mid;k++){
                vis[cells[k][0]-1][cells[k][1]-1] = true;
            }
            for(int k = 0;k<col;k++){
                if(!vis[0][k] && helperr(0, k, vis)){
                    isPath = true;
                    break;
                }

            }
            if(isPath) i = mid+1;
            else j = mid;
        }
        return i-1;

    }

    public boolean helperr(int i, int j, boolean[][] vis){
        if(i<0 || i>= vis.length || j<0 || j>= vis[0].length || vis[i][j])
            return false;
        if(i==vis.length) return true;
        vis[i][j] = true;
        if(helperr(i+1, j, vis) ||
                helperr(i-1, j, vis) ||
                helperr(i, j+1, vis) ||
                helperr(i, j-1, vis) )
            return true;
        return false;
    }

    //Now this is BFS + Binary Search

    int[] dir = new int[]{0, 1, 0, -1, 0};
    public int latestDayToCross(int row, int col, int[][] cells) {
        int left = 0;
        int right = cells.length;
        int ans = 0;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(help(cells, row, col, mid)){
                ans = mid;
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return ans;
    }

    public boolean help(int[][] cells, int row, int col, int mid){
        int[][] mat = new int[row][col];
        for(int i = 0;i<mid;i++){
            mat[cells[i][0]-1][cells[i][1]-1] = 1;
        }
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0;i<col;i++){
            if(mat[0][i]==0){
                q.add(new int[]{0, i});
                mat[0][i] = 1;
            }
        }
        while(!q.isEmpty()){
            int[] temp = q.poll();
            if(temp[0]==row-1)
                return true;
            for(int i=  1;i< dir.length;i++){
                int x = temp[0] + dir[i-1];
                int y = temp[1] + dir[i];
                if(x>=0 && y>=0 && x<row && y<col && mat[x][y]==0){
                    q.add(new int[]{x, y});
                    mat[x][y] = 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
