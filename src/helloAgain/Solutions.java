package helloAgain;


import java.util.*;



public class Solutions {
    public void nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;
        for(int i = n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        if(index==-1){
            reverse(0, n-1, nums);
            return;
        }
        for(int i = n-1;i>index;i--){
            if(nums[i]>nums[index]){
                swap(index, i, nums);
                break;
            }
        }

        reverse(index+1, n-1, nums);
    }

    public void reverse(int start, int end, int[] nums){
        while(start<end){
            swap(start, end, nums);
            start++;
            end--;
        }
    }

    public void swap(int index, int i, int[] nums){
        int temp = nums[index];
        nums[index] = nums[i];
        nums[i] = temp;
    }



    public static void main(String[] args){
        //System.out.println(dividePlayers(new int[]{3, 2, 5, 1, 3, 4}));

    }

}
