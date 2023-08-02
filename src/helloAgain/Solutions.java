package helloAgain;


import java.util.*;



public class Solutions {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] vis = new boolean[nums.length];
        helper(nums, vis, new ArrayList<>(), res);
        return res;

    }

    public void helper(int[] nums, boolean[] vis, List<Integer> temp, List<List<Integer>> res){
        if(temp.size()== nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0;i< nums.length;i++){
            if(vis[i]==true) continue;
            vis[i] = true;
            temp.add(nums[i]);
            helper(nums, vis, temp, res);
            temp.remove(temp.size()-1);
            vis[i] = false;
        }
    }



    public static void main(String[] args){
        //System.out.println(dividePlayers(new int[]{3, 2, 5, 1, 3, 4}));

    }

}
