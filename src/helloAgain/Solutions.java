package helloAgain;


import java.util.*;



public class Solutions {
    public static int maxCount(int[] banned, int n, int maxSum) {
        int count = 0;
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        for(int i:banned) set.add(i);
        for(int i = 1;i<=n;i++){
            if(!set.contains(i)){
                sum += i;
                count++;
            }
            if(sum>maxSum) break;
        }
        return count;

    }



    public static void main(String[] args){
        System.out.println(maxCount(new int[]{1, 6, 5}, 5, 6));

    }

}
