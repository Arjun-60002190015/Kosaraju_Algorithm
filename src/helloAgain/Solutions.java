package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        if(amount[2]==0)
            return 0;
        if(amount[1]==0)
            return amount[2];
        else {
            amount[1]--;
            amount[2]--;
            return 1 + fillCups(amount);

        }
    }

    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
