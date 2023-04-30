package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {

    int endR = 0;
    int endC = 0;
    int row, col;
    public int[][] findFarmland(int[][] land) {
        row = land.length;
        col = land[0].length;

        ArrayList<int[]> list = new ArrayList<>();
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(land[i][j]==1){
                    dfs(land, i, j);
                    list.add(new int[]{ i, j, endR, endC});
                    endR = 0;
                    endC = 0;
                }
            }
        }
        int[][] res = new int[list.size()][4];
        for(int i = 0;i<res.length;i++){
            res[i] = list.get(i);
        }
        return res;

    }

    public void dfs(int[][] land, int i, int j){
        if(i<0 || i>=row || j<0 || j>=col || land[i][j]==0)
            return;

        land[i][j] = 0;
        dfs(land, i+1, j);
        dfs(land, i, j+1);

        endC = Math.max(endC, j);
        endR = Math.max(endR, i);
    }





    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};


        //System.out.println(maxOperations(nums, 5));

    }

}
