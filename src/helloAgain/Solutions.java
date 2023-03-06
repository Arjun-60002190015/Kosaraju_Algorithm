package helloAgain;

import java.util.*;


public class Solutions {
    public static int findKthPositive(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        int j = 0;
        int num = 0;
        for(int i = 1;j<k;i++){
            if(!set.contains(i)){
                num = i;
                j++;
            }
        }
        return num;

    }


    public static void main(String[] args){
        int[] arr = {2,3,4, 7, 11};
        System.out.println(findKthPositive(arr, 5));

    }

}
