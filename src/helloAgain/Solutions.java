package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        st.push(s.charAt(0));
        for(int i = 1;i<n;i++){
            if(!st.isEmpty() && ((s.charAt(i)=='B' && st.peek()=='A') ||
                    (s.charAt(i)=='D' && st.peek()=='C'))){
                st.pop();

            }else{
                st.push(s.charAt(i));
            }
        }
        return st.size();

    }






    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};

    }

}
