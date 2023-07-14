package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    public int longestSubsequence(int[] arr, int difference) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int i = 0;i<arr.length;i++){
            int num = arr[i];
            if(map.containsKey(num-difference)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
            max = Math.max(max, map.get(num));
        }
        return max;

    }

    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
