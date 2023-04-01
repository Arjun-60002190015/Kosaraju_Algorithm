package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    static Map<String, Boolean> map = new HashMap<>();
    public static boolean isScramble(String s1, String s2) {
        if(s1.length()!=s2.length())
            return true;
        return solve(s1, s2);

    }

    public static boolean solve(String a, String b){
        int n = a.length();
        if(a.equals(b))
            return true;
        String key = a +" "+b;
        if(map.containsKey(key))
            return map.get(key);
        boolean flag = false;
        for(int i = 1;i<=n-1;i++){
            boolean Noswap = solve(a.substring(0, i), b.substring(0, i))
                            &&
                           solve(a.substring(i), b.substring(i));
            boolean swap = solve(a.substring(0, i), b.substring(n-i))
                            &&
                           solve(a.substring(i), b.substring(0, n -i));
            if(swap|| Noswap) {
                flag = true;
                break;
            }
        }
        map.put(key, flag);
        return flag;
    }






    public static void main(String[] args){
        int[] nums = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        System.out.println(isScramble("abcd", "caebd"));

    }

}
