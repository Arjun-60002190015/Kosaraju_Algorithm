package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    //Brute force

    public String longestNiceSubstringBruteForce(String s) {
        String res = "";
        for(int i = 0;i<s.length();i++){
            for(int j = 0;j<s.length();j++){
                String sub = s.substring(i, j+1);
                if(isNice(sub)){
                    if(sub.length()>res.length()){
                        res = sub;
                    }
                }
            }
        }
        return res;


    }

    public boolean isNice(String sub){
        HashSet<Character> set = new HashSet<>();
        for(char ch:sub.toCharArray()){
            set.add(ch);
        }

        for(int i = 0;i<sub.length();i++){
            char ch = sub.charAt(i);
            if(!set.contains(Character.toLowerCase(ch))){
                return false;
            }
            else if(!set.contains(Character.toUpperCase(ch))){
                return false;
            }

        }
        return true;
    }

    public String longestNiceSubstringOptimized(String s) {
        HashSet<Character> set = new HashSet<>();
        for(char ch:s.toCharArray()){
            set.add(ch);
        }
        for(int i = 0;i<=s.length()-1;i++){
            char ch = s.charAt(i);
            if(set.contains(Character.toUpperCase(ch)) && set.contains(Character.toLowerCase(ch)))
                continue;
            String one = longestNiceSubstringOptimized(s.substring(0, i));
            String two = longestNiceSubstringOptimized(s.substring(i+1));
            return one.length()>=two.length()? one:two;
        }
        return s;


    }


    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
