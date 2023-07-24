package helloAgain;


import javafx.scene.layout.Priority;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public String shiftingLetters(String s, int[] shifts) {
        char[] arr = s.toCharArray();
        for(int i = shifts.length-1;i>0;i--){
            shifts[i-1] += shifts[i];
            shifts[i-1] %= 26;
        }

        for(int i = 0;i< arr.length;i++){
            arr[i] = (char)('a' + (arr[i]-'a' + shifts[i])%26);
        }
        return String.valueOf(arr);
    }
    public static void main(String[] args){

    }

}
