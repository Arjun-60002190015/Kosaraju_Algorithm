package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int[] twoSumButWrongSolution(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for(int i = 0;i< numbers.length;i++){
            if(map.containsKey(target - numbers[i])){
                res[0] = i+1;
                res[1] = map.get(target - numbers[i]) +1;
            }else map.put(numbers[i], i);
        }
        Arrays.sort(res);
        return res;

    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while(numbers[left] + numbers[right]!=target){
            if((numbers[left] + numbers[right])>target){
                right--;
            }else{
                left++;
            }
        }
        return new int[] {left+1, right+1};
    }




        public static void main(String[] args){
        int[] nums = {2, 3, 5, 1, 3};

        //System.out.println(kidsWithCandies(nums, 3));

    }

}
