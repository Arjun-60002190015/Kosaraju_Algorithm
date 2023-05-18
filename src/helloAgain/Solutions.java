package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {


    public int[] sortArrayByParityII(int[] nums) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for(int i:nums){
            if(i%2!=0)
                odd.add(i);
            else even.add(i);
        }
        int oIndex = 0;
        int eIndex = 0;
        int count = 0;
        while(count< nums.length){
            if(count%2!=0)
                nums[count++] = odd.get(oIndex++);
            else
                nums[count++] = even.get(eIndex++);
        }
        return nums;


    }




    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};

    }

}
