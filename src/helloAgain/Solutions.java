package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {
    public String reorganizeString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b)-> map.get(b)-map.get(a));
        pq.addAll(map.keySet());
        StringBuilder sb = new StringBuilder();
        while(pq.size()>1){
            char first = pq.poll();
            char second = pq.poll();
            sb.append(first);
            sb.append(second);
            map.put(first, map.getOrDefault(first, 0)-1);
            map.put(second, map.getOrDefault(second, 0)-1);
            if(map.get(first)>0) pq.offer(first);
            if(map.get(second)>0) pq.offer(second);

        }
        if(!pq.isEmpty()){
            if(map.get(pq.peek())>1) return "";
            else sb.append(pq.poll());
        }
        return sb.toString();

    }



    public static void main(String[] args){
        int[] nums = {4, 5, 2, 1};
        int[] quesries = {3, 10, 21};
        //System.out.println(minimumSum(27, 49));
    }

}
