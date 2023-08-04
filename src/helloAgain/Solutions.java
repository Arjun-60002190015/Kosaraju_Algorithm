package helloAgain;


import java.util.*;



public class Solutions {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, i);
        }
        int max = 0;
        int prev = -1;
        for(int i = 0;i<s.length();i++){
            max = Math.max(max, map.get(s.charAt(i)));
            if(max==i){
                res.add(max-prev);
                prev = i;
            }
        }
        return res;

    }


    public static void main(String[] args){
        //System.out.println(partitionString("abacaba"));

    }

}
