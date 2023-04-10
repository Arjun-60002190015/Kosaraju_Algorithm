package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int index=  0;
        while(index<s.length()){
            char ch = s.charAt(index);
            if(ch=='{' || ch=='(' || ch=='[')
                stack.push(ch);
            else {
                if(!stack.isEmpty() && ch==')' && stack.peek()=='(')
                    stack.pop();
                else if (!stack.isEmpty() && ch=='}' && stack.peek()=='{')
                    stack.pop();
                else if(!stack.isEmpty() && ch==']' && stack.peek()=='[')
                    stack.pop();
                else return false;
            }
            index++;

        }
        return stack.isEmpty();

    }
    // Below solution is wrong because it doesn't take care of order of the brackets.
    public static boolean isValidWrong(String s) {
        int curly = 0;
        int square = 0;
        int braces = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='(')
                curly++;
            else if(s.charAt(i)=='{')
                braces++;
            else if(s.charAt(i)=='[')
                square++;
            else if(s.charAt(i)==')')
                curly--;
            else if(s.charAt(i)=='}')
                braces--;
            else if(s.charAt(i)==']')
                square--;
        }
        return curly==0 &&braces==0 && square==0;

    }


    public static void main(String[] args){
        String s = "(]";

        System.out.println(isValid(s));

    }

}
