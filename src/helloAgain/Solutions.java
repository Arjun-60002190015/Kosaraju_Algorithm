package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public static int findTheLongestBalancedSubstring(String s) {
        //int start = 0;
        int res = 0;
        int count = 0;
        int end = 0;
        char[] ch = s.toCharArray();

        while(end<ch.length){
            if(ch[end]==0) {
                count++;


            }else {
                count--;
            }
            res = Math.max(count, res);
            end++;

        }
        return res*2;

    }

    public static void main(String[] args){
        String s = "01000111";
        System.out.println(findTheLongestBalancedSubstring(s));

    }

}
