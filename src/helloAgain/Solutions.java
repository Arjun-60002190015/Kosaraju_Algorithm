package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        List<Character> temp = new ArrayList<>(map.keySet());
        Collections.sort(temp, (a, b)-> map.get(b)-map.get(a));
        String res = "";
        for(Object i:temp){
            for(int j = 0;j<map.get(i);j++){
                res += i;
            }
        }
        return res;

    }

    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
