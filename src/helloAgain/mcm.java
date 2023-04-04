package helloAgain;

//Palindrome Partitioning memoized

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class mcm {
    public int partitionString(String s) {
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(int i  =0;i<s.length();i++) {
            if (set.contains(s.charAt(i))){
                count++;
                set.clear();
                set.add(s.charAt(i));
            }
            else set.add(s.charAt(i));
        }
        return count;


    }





    public static void main(String[] args){
        String s = "aab";
        //System.out.println(minCut(s));
    }
}
