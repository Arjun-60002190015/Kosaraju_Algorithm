package helloAgain;

import java.util.*;



public class Solutions {

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<magazine.length();i++){
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0)+1);

        }
        for(char c:ransomNote.toCharArray()){
            if(!map.containsKey(c) || map.get(c)<=0)
                return false;
            map.put(c, map.get(c) - 1);
        }
        return true;

    }




    public static void main(String[] args){
        int[] arr = {1,5,2, 4, 1};
        //System.out.println((arr));

    }

}
