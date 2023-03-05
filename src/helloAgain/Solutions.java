package helloAgain;

import java.util.LinkedList;
import java.util.Queue;

public class Solutions {
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        while(!q.isEmpty()){
            start = q.poll();
            if(arr[start]==0)
                return true;
            if(arr[start]<0)
                continue;
            if(arr[start] + start<arr.length)
                q.add(arr[start] + start);
            if(start - arr[start]>=0)
                q.add(start - arr[start]);

            arr[start] *= -1;
        }
        return false;

    }


    public static void main(String[] args){

    }

}
