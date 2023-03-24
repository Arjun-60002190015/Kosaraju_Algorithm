package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {

    public int findCircleNum(int[][] isConnected) {
        int[] visited  =new int[isConnected.length];
        int count = 0;
        for(int i = 0;i< isConnected.length;i++){
            if(visited[i]==0){
                helper(isConnected, visited, i);
                count++;
            }
        }
        return count;

    }

    public void helper(int[][] connected, int[] visited, int i){
        for(int j = 0;j< connected.length;j++){
            if(connected[i][j] ==1 && visited[j]==0){
                visited[j] = 1;
                helper(connected, visited, j);
            }
        }
    }



    public static void main(String[] args){

        int n = 6;
        int[][] connections = {{0,1},{1,3},{2,3},{4,0},{4,5}};
        //System.out.println(minReorder(n, connections));

    }

}
