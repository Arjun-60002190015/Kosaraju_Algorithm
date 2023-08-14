package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {
    Random rnd = new Random();
    public int findKthLargest(int[] nums, int k) {
        int index = nums.length-k;
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int pivot = partition(nums, start, end);
            if(pivot==index) break;
            else if(pivot<index) start = pivot+1;
            else end = pivot-1;
        }
        return nums[index];

    }

    public int partition(int[] nums, int start, int end){
        swap(nums, end, start + rnd.nextInt(end-start));
        int pivot = nums[end];
        int j = start;
        for(int i = start;i<end;i++){
            if(nums[i]<pivot){
                swap(nums, i, j++);
            }
        }
        swap(nums, end, j);
        return j;
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }



    public static void main(String[] args){
        int[] nums = {4, 5, 2, 1};
        int[] quesries = {3, 10, 21};
        //System.out.println()
    }

}
