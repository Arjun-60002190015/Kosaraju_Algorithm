package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public String smallestSubsequence(String s) {
        int[] lastIndex = new int[26];
        boolean[] vis = new boolean[26];
        for(int i = 0;i<s.length();i++){
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<s.length();i++){
            int ch = s.charAt(i) - 'a';
            if(vis[ch])
                continue;
            while(!stack.isEmpty() && stack.peek()>ch && i<lastIndex[stack.peek()]){
                vis[stack.pop()] = false;
            }
            stack.push(ch);
            vis[ch] = true;

        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append((char)(stack.pop() +'a'));

        }
        return sb.reverse().toString();

    }


    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
