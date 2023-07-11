package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    int max = Integer.MAX_VALUE;
    int totDiff = Integer.MAX_VALUE;
    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        for(int i = 0;i< baseCosts.length;i++) {
            helper(baseCosts[i], toppingCosts,0,  target);
        }
        return max;

    }

    public void helper(int base, int[] topping, int index, int target){
        int diff = Math.abs(target-base);
        if(diff<totDiff || (diff==totDiff && base<max)){
            totDiff = diff;
            max = base;
        }

        if(index== topping.length || base>target)
            return;

        helper(base, topping, index+1, target);
        helper(base+ topping[index], topping, index+1, target);
        helper(base+2* topping[index], topping, index+1, target);
    }

    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
