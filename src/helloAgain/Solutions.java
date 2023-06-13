package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {

    public int equalPairs(int[][] grid) {
        Map<Integer, List<Integer>> row = new HashMap<>();
        Map<Integer, List<Integer>> col = new HashMap<>();
        for(int i = 0;i<grid.length;i++){
            row.put(i, new ArrayList<>());
        }
        for(int i = 0;i< grid.length;i++){
            col.put(i, new ArrayList<>());
        }
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid.length;j++){
                row.get(i).add(grid[i][j]);
                col.get(j).add(grid[i][j]);
            }
        }
        int count = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j< grid.length;j++){
                if(row.get(i).equals(col.get(j)))
                    count++;
            }
        }
        return count;

    }


    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
