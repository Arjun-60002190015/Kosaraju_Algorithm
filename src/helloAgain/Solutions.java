package helloAgain;


import java.util.*;



public class Solutions {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = String.valueOf(c);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }
        return new ArrayList<>(map.values());

    }



    public static void main(String[] args){
        //System.out.println(helper(new String("sea"), new String("eat")));

    }

}
