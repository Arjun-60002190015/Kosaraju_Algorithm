package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public int[] numberOfLines(int[] widths, String s) {
        int count = 0;
        char[] ch = s.toCharArray();
        int[] res = new int[2];
        for(int i = 0;i< ch.length;i++){
            if(count + widths[s.charAt(i) - 'a']>100){
                count = 0;
                res[0]++;
            }
            count += widths[s.charAt(i) - 'a'];
        }
        res[0]++;
        res[1] = count;
        return res;
    }




        public static void main(String[] args){

        int[] nums = {-5, 8, -14, 2, 4, 12};
        //System.out.println(maxSub(nums, -5));

    }

}
