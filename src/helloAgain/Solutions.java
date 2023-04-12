package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder();
        Stack<String> s = new Stack<>();
        String[] arr = path.split("/");

        for(int i = 0;i<arr.length;i++){
            if(!s.isEmpty() && arr[i].equals(".."))
                s.pop();
            else if(!arr[i].equals("") && !arr[i].equals(".") && !arr[i].equals(".."))
                s.push(arr[i]);
        }

        if(s.isEmpty())
            return "/";
        while(!s.isEmpty()){
            sb.insert(0, s.pop()).insert(0, "/");
        }
        return sb.toString();

    }


    public static void main(String[] args){
        int[] nums = {10, 2};

        //System.out.println(largestNumber(nums));

    }

}
