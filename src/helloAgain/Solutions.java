package helloAgain;


import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int minimumDeletions(String s) {
        int index = -1;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                index = i;
                break;
            }
        }
        if(index==-1) return 0;
        int count = 0;
        int b=  0;
        for(int i = index;i<s.length();i++){
            if(s.charAt(i)=='b') b++;
            else count++;
            count = Math.min(count, b);
        }
        return count;

    }




    public static void main(String[] args){

        //System.out.println(arrangeCoins(3));

    }

}
