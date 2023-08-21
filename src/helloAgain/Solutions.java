package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {
    public boolean rotateString(String s, String goal) {
        if(s==null || goal==null) return false;
        if(goal.length()!=s.length()) return false;
        if(s==null) return true;

        for(int i = 0;i<s.length();i++){
            if(check(s, goal, i)) return true;
        }
        return false;

    }

    public boolean check(String s, String goal, int i){
        for(int j = 0;j<s.length();j++){
            if(s.charAt(j)!=goal.charAt((j+i)%goal.length())) return false;
        }
        return true;
    }



    public static void main(String[] args){
        int[] nums = {4, 5, 2, 1};
        int[] quesries = {3, 10, 21};
        //System.out.println(minimumSum(27, 49));
    }

}
