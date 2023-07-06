package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    int max  = 0;

    public int maxUniqueSplit(String s) {
        helper(0, s, new HashSet<String>());
        return max;
    }

    public void helper(int start, String s, HashSet<String> set){
        if(start==s.length()){
            max = Math.max(set.size(), max);
            return;
        }

        for(int i = start+1; i<=s.length();i++){
            String newS = s.substring(start, i);
            if(!set.contains(newS)){
                set.add(newS);
                helper(i, s, set);
                set.remove(newS);
            }
        }
    }




    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
