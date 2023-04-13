package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for(int i:pushed){
            stack.push(i);
            while(!stack.isEmpty() && stack.peek()==popped[index]) {
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();

    }


    public static void main(String[] args){
        int[] nums = {10, 2};

        //System.out.println(largestNumber(nums));

    }

}
