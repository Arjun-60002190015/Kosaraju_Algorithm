package helloAgain;


import javafx.scene.layout.Priority;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.sql.Array;
import java.util.*;



public class Solutions {

    public int minHeightShelves(int[][] books, int shelfWidth) {
        int[] memo = new int[books.length];
        return helper(books, shelfWidth, 0, memo);

    }

    public int helper(int[][] books, int shelfWidth, int index, int[] memo){
        if(index== books.length) return 0;
        if(memo[index]!=0) return memo[index];
        int ans = Integer.MAX_VALUE;
        int height = 0;
        int width = 0;
        for(int i = index;i< books.length;i++){
            width += books[i][0];
            if(width>shelfWidth) break;
            height = Math.max(height, books[i][1]);
            ans = Math.min(ans, height + helper(books, shelfWidth,i+1, memo));
        }
        return memo[index] = ans;
    }


    public static void main(String[] args){

        //System.out.println(checkPossibility(new int[]{3, 4, 2, 3}));
    }

}
