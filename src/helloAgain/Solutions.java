package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    public boolean escapeGhosts(int[][] ghosts, int[] target) {
        int dist = Math.abs(target[0]) + Math.abs(target[1]);
        for(int[] i:ghosts){
            if(Math.abs(i[0]-target[0]) + Math.abs(i[1]-target[1])<=dist)
                return false;
        }
        return true;


    }

    public static void main(String[] args){
        int n = 3;
        //System.out.println(generateParenthesis(n));

    }

}
