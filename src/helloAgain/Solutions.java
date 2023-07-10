package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    public List<String> restoreIpAddresses(String s) {
        if(s==null || s.length()<4 || s.length()>12)
            return new ArrayList<>();
        StringBuilder sb = new StringBuilder(s);
        List<String> res =  new ArrayList<>();
        helper( 0, sb, res, 3);
        return res;

    }

    public void helper(int index, StringBuilder sb, List<String> res, int dots){
        if(dots==0){
            if(check(sb)){
                res.add(sb.toString());

            }
            return;
        }
        if(index>=sb.length())
            return;


        sb.insert(index, ".");
        helper(index+2, sb, res, dots-1);
        sb.deleteCharAt(index);
        helper(index+1, sb, res, dots);
    }

    public boolean check(StringBuilder s) {
        String[] parts = s.toString().split(".");
        if(parts.length!=4)
            return false;

        for(String part:parts){
            if(part.length()==0 || part.length()>3)
                return false;
            if(part.startsWith("0") && part.length()>1)
                return false;

            int num = Integer.parseInt(part);
            if(num>255)
                return false;

        }
        return true;
    }




    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
