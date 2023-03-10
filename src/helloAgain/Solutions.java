package helloAgain;

import java.util.*;



public class Solutions {

    public static int arrangeCoins(int n) {
        int count = 1;
        while(n>0){
            count++;
            n -= count;
        }
        return count-1;

    }




    public static void main(String[] args){
        int[] arr = {1,5,2, 4, 1};
        int n = 5;
        System.out.println(arrangeCoins(n));

    }

}
