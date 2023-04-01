package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public static boolean isScramble(String s1, String s2) {
        if(s1.length()!=s2.length())
            return false;
        int n = s1.length();
        for(int i = 1;i<n;i++){
            if(solve(s1.substring(0, i), s2.substring(0, i)) && solve(s1.substring(i, n), s2.substring(i, n))
             ||
                solve(s1.substring(0, i), s2.substring(n-i, n)) && solve(s1.substring(i, n), s2.substring(0, n-i))) ;
            return true;
        }
        return false;


    }

    public static boolean solve(String a, String b){
        if(a.compareTo(b)==0)
            return true;
        if(a.length()<=1)
            return false;
        return false;
    }






    public static void main(String[] args){
        int[] nums = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        System.out.println(isScramble("abcd", "caebd"));

    }

}
