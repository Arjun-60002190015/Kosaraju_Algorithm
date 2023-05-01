package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {

    public int countBattleships(char[][] board) {
        int count = 0;
        for(int i = 0;i< board.length;i++){
            for(int j = 0;j< board[0].length;j++) {
                if (board[i][j] == 'X'){
                    helper(i, j, board);
                    count++;
                }
            }
        }
        return count;

    }

    public void helper(int i, int j, char[][] board){
        if(i<0 || i>= board.length || j<0 || j>= board[0].length || board[i][j]=='.')
            return;
        board[i][j] = '.';
        helper(i+1, j, board);
        helper(i-1, j, board);
        helper(i, j+1, board);
        helper(i, j-1, board);
    }





    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};


        //System.out.println(maxOperations(nums, 5));

    }

}
