package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {

    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1;i>=0;i--){
            int stars = 0;
            if(s.charAt(i)!='*' && stars==0) {
                sb.append(s.charAt(i));
            }
            else if(s.charAt(i)=='*') {
                stars++;
            }
            else if(s.charAt(i)!='*' && stars!=0) {
                    stars--;
            }
        }
        sb.reverse();
        return sb.toString();

    }


    public static void main(String[] args){
        String s = "(]";

        //System.out.println(isValid(s));

    }

}
