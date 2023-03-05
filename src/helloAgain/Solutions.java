package helloAgain;

import java.util.*;
//Solution to Jump Game 4(leetcode) 😎😎😎😎

public class Solutions {
    public int minJumps(int[] arr) {
        int n = arr.length;
        if(n==1) return 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        int step = 0;
        for(int i = 0;i<n;i++){
            map.computeIfAbsent(arr[i], v -> new ArrayList<>()).add(i);
        }
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        while(!q.isEmpty()){
            step++;
            int size = q.size();
            for(int i = 0;i<size;i++){
                int j = q.poll();
                if(j-1>=0 && map.containsKey(arr[j-1])){
                    q.add(j-1);
                }
                if(j+1<n && map.containsKey(arr[j+1])){
                    if(j+1==n-1)
                        return step;
                    q.offer(j+1);
                }
                if(map.containsKey(arr[j])){
                    for(int k:map.get(arr[j])){
                        if(k!=j){
                            if(k==n-1) return step;
                            q.offer(k);
                        }
                    }
                }
                map.remove(arr[j]);
            }
        }
        return step;


    }


    public static void main(String[] args){
        int[] arr = {4,2,3,0,3,1,2};
        //System.out.println(canReach(arr, 5));

    }

}
