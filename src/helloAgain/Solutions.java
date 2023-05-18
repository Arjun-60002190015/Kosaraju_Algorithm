package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {


    public int[] sortArrayByParity(int[] nums) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for(int i:nums){
            if(i%2!=0)
                odd.add(i);
            else even.add(i);
        }

        for(int i = 0;i< even.size();i++){
            nums[i] = even.get(i);
        }
        int index = 0;
        for(int i = even.size();i< even.size()+ odd.size();i++){
            nums[i] = odd.get(index);
            index++;
        }
        return nums;

    }




    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};

    }

}
