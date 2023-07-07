package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    int max = Integer.MIN_VALUE;
    public int maxLength(List<String> arr) {
        helper(0, "", arr);
        return max;
    }

    public void helper(int index, String s, List<String> arr){
        max = Math.max(max, s.length());

        for(int i = index;i< arr.size();i++){
            if(!isValid(s, arr.get(i))) continue;
            helper(i+1, s+arr.get(i), arr);
        }
    }

    public boolean isValid(String s, String p){
        HashSet<Character> set = new HashSet<>();
        for(char i:s.toCharArray()){
            if(set.contains(i))
                return false;
            set.add(i);
        }
        for(char i:p.toCharArray()){
            if(set.contains(i))
                return false;
            set.add(i);
        }
        return true;
    }







    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
