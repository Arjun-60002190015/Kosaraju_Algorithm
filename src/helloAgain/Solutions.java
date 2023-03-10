package helloAgain;

import java.util.*;



public class Solutions {

    public int maximumGroups(int[] grades) {
        int count = 1;
        int i = 1;
        int helper = 2;
        while(i<grades.length){
            i += helper;
            helper++;
            if(i<=grades.length)
                count++;
        }
        return count;

    }







    public static void main(String[] args){
        char[] c = {'c', 'f', 'j'};
        int n = 5;
        //System.out.println(nextGreatestLetter(c, 'a'));

    }

}
