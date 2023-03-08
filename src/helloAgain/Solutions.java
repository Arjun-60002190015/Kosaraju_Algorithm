package helloAgain;

import java.util.*;



public class Solutions {


    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> a[0]!=b[0]? a[0] - b[0]:a[1] - b[1]);
        int index= 0 ;
        for(int[] row:mat){
            int start = 0, end = row.length;
            while(start<end){
                int mid = start + (end - start)/2;
                if(row[mid]!=0)
                    start = mid+1;
                else end = mid;
            }
            q.add(new int[]{start, index});
            index++;
        }
        int[] res = new int[k];
        for(int i = 0;i<k;i++){
            res[i] = q.remove()[1];
        }
        return res;

    }


    public static void main(String[] args){
        int[] arr = {1,5,2, 4, 1};
        //System.out.println((arr));

    }

}
