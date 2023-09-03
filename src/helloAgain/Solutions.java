package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {
    int mod = (int)1e9+7;
    HashMap<String, Integer> map;
    public int numWays(int steps, int arrLen) {
        //Integer[][] dp = new Integer[arrLen+1][steps+1];
        map = new HashMap<>();
        return helper(0, steps, arrLen);

    }

    public int helper(int i, int k, int len){
        if(i<0 || i>=len) return 0;
        if(k==0){
            return i==0?1:0;
        }
        String res = i+","+k;
        if(map.containsKey(res)) return map.get(res);
        int ways = 0;
        ways = (ways+ helper(i-1, k-1, len))%mod;
        ways = (ways + helper(i+1, k-1, len))%mod;
        ways = (ways + helper(i, k-1, len))%mod;
        map.put(res, ways);
        return ways;
    }





    public static void main(String[] args){
        int[] nums = {3, 4, 9, 1, 3, 9, 5};
        //System.out.println(canBeEqual("cmpr", "rmcp"));
    }

}
