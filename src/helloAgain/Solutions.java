package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public boolean exist(char[][] board, String word) {
        boolean flag = false;
        for(int i = 0;i< board.length;i++){
            for(int j = 0;j< board[i].length;j++){
                if(board[i][j]==word.charAt(0)){
                    flag = helper(board, 0, i, j, word);

                }
            }
        }
        return flag;

    }

    public boolean helper(char[][] board, int length, int i, int j, String word){
        if(i<0 || i>= board.length || j<0 || j>= board[0].length)
            return false;
        if(board[i][j]==word.charAt(length)){
            char temp = board[i][j];
            board[i][j] = '#';
            if(length==word.length()-1) {
                return true;
            }
            else if(helper(board, length+1, i-1, j, word)
            || helper(board, length+1, i+1, j, word)
            || helper(board, length+1, i, j+1, word)
            || helper(board, length+1, i, j-1, word)){
                return true;
            }
            board[i][j] = temp;
        }
        return false;

    }


    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
