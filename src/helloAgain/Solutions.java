package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {

    public int numOfStrings(String[] patterns, String word) {
        int ans = 0;
        for(int i = 0;i< patterns.length;i++){
            char ch = patterns[i].charAt(0);
            int len = patterns[i].length();
            for(int j = 0;j<word.length();j++){
                if(word.charAt(j)==ch){
                    if(j + len <= word.length()){
                        if(patterns[i].equals(word.substring(j, j+len))){
                            ans++;
                            break;
                        }
                    }
                }
            }
        }
        return ans;

    }







    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};


        //System.out.println(maxOperations(nums, 5));

    }

}
