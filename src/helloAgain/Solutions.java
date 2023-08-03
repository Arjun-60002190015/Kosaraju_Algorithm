package helloAgain;


import java.util.*;



public class Solutions {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<>();
        String[] arr = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> res=  new ArrayList<>();
        helper("", digits, res, arr);
        return res;

    }

    public void helper(String temp, String digits, List<String> res, String[] arr){
        if(digits.isEmpty()){
            res.add(temp);
            return;
        }
        String letters = arr[digits.charAt(0)-'2'];
        for(char letter:letters.toCharArray()){
            helper(temp + letter, digits.substring(1), res, arr);
        }

    }


    public static void main(String[] args){
        //System.out.println(pivotInteger(8));

    }

}
