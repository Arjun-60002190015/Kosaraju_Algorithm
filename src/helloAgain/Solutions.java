package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public String mergeAlternately(String word1, String word2) {
        int first = 0;
        int second = 0;
        StringBuilder res = new StringBuilder();
        while(first<word1.length() || second<word2.length()){
            if(first<word1.length()){
                res.append(word1.charAt(first));
                first++;
            }
            if(second<word2.length()){
                res.append(word2.charAt(second));
                second++;
            }
        }

        return res.toString();


    }


    public static void main(String[] args){
        int[] nums = {2, 3, 5, 1, 3};
        String ne = "ab";
        String we = "pqrs";

        //System.out.println(mergeAlternately(ne, we));

    }

}
