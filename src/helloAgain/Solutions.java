package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    public String findDifferentBinaryString(String[] nums) {
        Set<String> set = new HashSet<>(Arrays.asList(nums));
        int n = nums[0].length();
        String res = "";
        return helper(res, n, set);
    }

    public String helper(String res, int n, Set<String> set){
        if(res.length()==n){
            if(!set.contains(res)){
                return res;
            }
            else{
                return null;
            }
        }
        String r = helper(res+"1", n, set);
        if(r!=null)
            return r;
        r = helper(res+"0", n, set);
        if(r!=null)
            return r;
        return null;

    }

    public static void main(String[] args){
        int n = 3;
        //System.out.println(generateParenthesis(n));

    }

}
