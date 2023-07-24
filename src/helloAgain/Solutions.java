package helloAgain;


import javafx.scene.layout.Priority;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int[] executeInstructions(int n, int[] startPos, String s) {

        int[] res = new int[s.length()];
        for(int i = 0;i<s.length();i++){
            res[i] = helper(startPos[0], startPos[1], s, i, n) - i;
        }
        return res;
    }

    public int helper(int i, int j, String s, int index, int n){
        if(i<0 || i>= n || j<0 || j>=n){
            return index-1;
        }
        if(index>=s.length()) return index;
        if(s.charAt(index)=='U')
            return helper(i-1, j, s, index+1, n);
        if(s.charAt(index)=='D')
            return helper(i+1, j, s, index+1, n);
        if(s.charAt(index)=='L')
            return helper(i, j-1, s, index+1, n);
        else return helper(i, j+1, s, index+1, n);
    }
    public static void main(String[] args){

    }

}
