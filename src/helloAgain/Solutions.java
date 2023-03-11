package helloAgain;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {

    public static int pivotInteger(int n) {
        int[] front = new int[n];
        int sum = 0;
        front[0] = 1;
        int[] back = new int[n];
        for(int i = 1;i<n;i++){
            front[i] = front[i-1] + i +1;

        }
        back[n-1] = n;
        for(int i = n-2;i>=0;i--){
            back[i] = back[i+1] +1 +i;

        }
        for(int i = 0;i<n;i++){
            if(front[i]==back[i])
                return i;
        }
        return -1;

    }









        public static void main(String[] args){

        int n = 8;
        System.out.println(pivotInteger(n));

    }

}
