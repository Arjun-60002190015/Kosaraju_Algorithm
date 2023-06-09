package helloAgain;

//Palindrome Partitioning memoized

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class mcm {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(letters[mid]<=target){
                start = mid+1;
            }else end = mid-1;
        }
        return start==letters.length? letters[0]:letters[start];

    }



    public static void main(String[] args){
        String a = "aaa";
        //System.out.println(addMinimum(a));
    }
}
