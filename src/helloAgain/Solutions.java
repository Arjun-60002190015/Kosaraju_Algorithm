package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {


    public String smallestString(String s) {
        char[] c = s.toCharArray();
        boolean flag = false;
        int i = 0;
        if(c[0]=='a'){
            while(i<c.length && c[i]=='a')
                i++;
            if(i==c.length){
                c[i-1]= 'z';
                return String.valueOf(c);
            }
        }
        if (c[i] != 'a') {

            while(i<c.length && c[i]!='a'){
                c[i] = (char)(c[i]-1);
                i++;
            }
        }

        return String.valueOf(c);

    }


    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
