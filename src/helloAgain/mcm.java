package helloAgain;

//Palindrome Partitioning memoized

import java.util.Arrays;

public class mcm {
    public int superEggDrop(int k, int n) {
        if(n==0 || n==1)
            return n;
        if(k==1)
            return n;
        int min = Integer.MAX_VALUE;
        for(int i = 1;i<=k;i++){
            int temp = 1+ Math.max(superEggDrop(k - 1, i-1), superEggDrop(k, n-i));
            min = Math.min(min, temp);
        }
        return min;

    }





    public static void main(String[] args){
        String s = "aab";
        //System.out.println(minCut(s));
    }
}
