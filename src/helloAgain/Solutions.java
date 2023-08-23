package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {
    public int leastInterval(char[] tasks, int n) {
        int[] chars = new int[26];
        for(char c:tasks){
            chars[c-'A']++;
        }
        Arrays.sort(chars);
        int max = chars[25]-1;
        int val = max*n;
        for(int i = 24;i>=0;i--){
            val -= Math.min(chars[i], max);
        }
        return val>0? tasks.length+val : tasks.length;

    }



    public static void main(String[] args){
        int[] nums = {4, 5, 2, 1};
        int[] quesries = {3, 10, 21};
        //System.out.println(minimumSum(27, 49));
    }

}
