package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int[][] temp = new int[n][2];
        for(int i = 0;i<n;i++){
            temp[i] = new int[]{nums1[i], nums2[i]};
        }
        Arrays.sort(temp, (a,b)-> b[1] - a[1]);

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        long sum = 0;
        for(int i = 0;i<k;i++){
            sum += temp[i][0];
            queue.add(temp[i][0]);
        }

        long ans = sum * temp[k-1][1];

        for(int i = k;i<n;i++){
            sum += temp[i][0] - queue.poll();
            queue.add(temp[i][0]);

            ans = Math.max(sum * temp[i][1], ans);
        }
        return ans;

    }






    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};

    }

}
