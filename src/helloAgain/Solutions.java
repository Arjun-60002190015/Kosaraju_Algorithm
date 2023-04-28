package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int numSimilarGroups(String[] strs) {
        int n = strs.length;
        boolean[] visied = new boolean[n];
        int count = 0;
        for(int i = 0;i<n;i++){
            if(!visied[i]){
                dfs(strs, visied, i);
                count++;
            }
        }
        return count;

    }

    public void dfs(String[] strs, boolean[] visited, int i){
        visited[i] = true;
        for(int j = 0;j< strs.length;j++){
            if(!visited[j] && isSimilar(strs[i],strs[j] ))
                dfs(strs, visited, j);

        }
    }

    public boolean isSimilar(String s1, String s2){
        int diff = 0;
        for(int i = 0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i))
                diff++;
            if(diff>2)
                return false;
        }
        return true;
    }





    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};


        //System.out.println(maxOperations(nums, 5));

    }

}
