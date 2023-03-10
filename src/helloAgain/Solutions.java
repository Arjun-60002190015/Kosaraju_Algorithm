package helloAgain;

import java.util.*;



public class Solutions {

    public static char nextGreatestLetter(char[] letters, char target) {
        char res = letters[0];
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(letters[mid]==target)
                start = mid +1;
            if(letters[mid]<target){
                start = mid+1;
            }else if(letters[mid]>target){
                res = letters[mid];
                end = mid - 1;
            }
        }
        return res;
    }







    public static void main(String[] args){
        char[] c = {'c', 'f', 'j'};
        int n = 5;
        System.out.println(nextGreatestLetter(c, 'a'));

    }

}
