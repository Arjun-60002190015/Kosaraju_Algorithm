package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(0, candidates, target, new ArrayList<>());
        return res;

    }

    public void helper(int index, int[] nums, int target, List<Integer> temp){
        if(target==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(index== nums.length || target<0)
            return;
        for(int i = index;i< nums.length;i++){
            temp.add(nums[i]);
            helper(i, nums, target-nums[i], temp);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args){
        int n = 3;
        //System.out.println(generateParenthesis(n));

    }

}
