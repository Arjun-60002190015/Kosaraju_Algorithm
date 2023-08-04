package helloAgain;


import java.util.*;



public class Solutions {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashMap<String, Boolean> map = new HashMap<>();

        Set<String> set = new HashSet<>(wordDict);
        return helper(s, set, map);

    }

    public boolean helper(String s, Set<String> set, Map<String, Boolean> map){
        if(map.containsKey(s)) return map.get(s);
        if(set.contains(s)) return true;
        for(int i = 0;i<s.length();i++) {
            if (set.contains(s.substring(0, i)) && helper(s.substring(i), set, map)) {
                map.put(s, true);
                return true;
            }
        }
        map.put(s, false);
        return false;
    }


    public static void main(String[] args){
        //System.out.println(pivotInteger(8));

    }

}
