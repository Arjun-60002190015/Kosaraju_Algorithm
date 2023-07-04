package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> res = new HashSet<List<Integer>>();
        helper(res, 0, Integer.MIN_VALUE, nums, new ArrayList<>());
        List r = new ArrayList<>(res);
        return r;
    }

    public void helper(Set<List<Integer>> res, int index, int prev, int[] nums, List<Integer> temp){
        if(temp.size()>1){

            res.add(new ArrayList<>(temp));

        }



        for(int i = index;i< nums.length;i++){
            if(nums[i]>=prev){
                temp.add(nums[i]);
                helper(res, i+1, nums[i],nums, temp );
                temp.remove(temp.size()-1);
            }
        }
    }




    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
