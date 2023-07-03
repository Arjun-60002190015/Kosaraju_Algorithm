package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        helper(n, k ,1 ,  new ArrayList<>(), res);
        return res;

    }

    public void helper(int n, int k, int start,  List<Integer> temp, List<List<Integer>> res){
        if(temp.size()==k){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i = start;i<=n;i++){
            temp.add(i);
            helper(n, k, i+1, temp, res);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args){
        int n = 3;
        //System.out.println(generateParenthesis(n));

    }

}
