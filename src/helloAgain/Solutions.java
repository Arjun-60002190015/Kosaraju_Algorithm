package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        helper( 0, s, res, new ArrayList<>());
        return res;
    }

    public void helper(int start, String s, List<List<String>> res, List<String> temp){
        if(start==s.length()){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i = start;i<s.length();i++){
            if(isPalin(s, start, i)){
                temp.add(s.substring(start, i+1));
                helper(i+1, s, res, temp);
                temp.remove(temp.size()-1);
            }
        }

    }

    public boolean isPalin(String s, int i, int j){

        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else return false;
        }
        return true;
    }

    public static void main(String[] args){
        int n = 3;
        //System.out.println(generateParenthesis(n));

    }

}
