package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    StringBuilder sb = new StringBuilder();
    public String getHappyString(int n, int k) {
        List<String> res = new ArrayList<>();
        helper(n, res, ' ');
        Collections.sort(res);
        if(res.size()>=k)
            return res.get(k-1);
        return "";


    }

    public void helper(int n, List<String> res, char prev){
        if(sb.length()==n) {
            res.add(sb.toString());
            return;
        }
        for(char ch = 'a';ch<='c';ch++){
            if(ch!=prev){
                sb.append(ch);
                helper(n, res, ch );
                sb.delete(sb.length()-1, sb.length());

            }
        }
    }

    public static void main(String[] args){
        int n = 3;
        //System.out.println(generateParenthesis(n));

    }

}
