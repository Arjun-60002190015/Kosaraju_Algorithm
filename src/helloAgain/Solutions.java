package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    List<Integer> res = new ArrayList<>();
    public int[] numsSameConsecDiff(int n, int k) {
        for(int i = 1;i<=9;i++){
            helper(n-1, k, i);
        }

        int[] nums = new int[res.size()];
        for(int i = 0;i< res.size();i++){
            nums[i] = res.get(i);
        }
        return  nums;



    }

    public void helper(int n, int k, int num){
        if(n==0){
            res.add(num);
            return;
        }
        int digit = num%10;
        if(digit-k>=0){
            helper(n-1, k, num*10 + (digit-k));
        }
        if(digit+k<=9 && digit+k!=digit-k){
            helper(n-1, k, num*10 + (digit+k));
        }
    }




    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
