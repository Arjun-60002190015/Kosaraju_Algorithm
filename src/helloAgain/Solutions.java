package helloAgain;


import java.util.*;



public class Solutions {
    //int index = -1;
    public int appendCharacters(String s, String t) {
        int i = 0;
        int j = 0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else i++;
        }
        return t.length()-j;

    }






    public static void main(String[] args){
        //System.out.println(pivotInteger(8));

    }

}
