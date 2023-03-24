package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {

    public char findTheDifference(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int i = 0;i<t.length();i++){
            char key  = t.charAt(i);
            if(!map.containsKey(key))
                return key;
            else if(map.get(key)==0)
                return key;
            else{
                map.put(key, map.get(key)-1);
            }
        }
        return 'n';

    }



    public static void main(String[] args){

        int n = 6;
        int[][] connections = {{0,1},{1,3},{2,3},{4,0},{4,5}};
        //System.out.println(minReorder(n, connections));

    }

}
