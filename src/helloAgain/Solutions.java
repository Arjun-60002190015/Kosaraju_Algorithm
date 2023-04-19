package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        if(skill.length==2)
            return skill[0]*skill[1];

        long res = 0;
        int k = skill[0]+skill[skill.length-1];
        int index = 0;
        while(index< skill.length/2){
            if(skill[index] + skill[skill.length - index]==k){
                res += (skill[index]*skill[skill.length - index]);
                index++;

            }else return -1;
        }
        return res;


    }



    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};


        //System.out.println(maxOperations(nums, 5));

    }

}
