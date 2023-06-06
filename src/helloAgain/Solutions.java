package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        boolean [] visited = new boolean[128];
        HashMap<Character, Character> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i))!=t.charAt(i))
                    return false;
            }else{
                if(visited[t.charAt(i)])
                    return false;
                visited[t.charAt(i)] = true;
                map.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;


    }


    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
