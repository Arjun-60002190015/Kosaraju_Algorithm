package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for(int i:candies){
            if(i>max){
                max = i;
            }
        }
        List<Boolean> res = new ArrayList<>();
        for(int i = 0;i< candies.length;i++){
            if((candies[i]+extraCandies)>=max) {
                res.add(i,true);
            }else res.add(i, false);
        }
        return res;


    }



    public static void main(String[] args){
        int[] nums = {2, 3, 5, 1, 3};

        System.out.println(kidsWithCandies(nums, 3));

    }

}
