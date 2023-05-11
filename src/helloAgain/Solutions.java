package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public int maxAreaBruteForce(int[] height) {
        int n = height.length;
        int max = 0;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int area = Math.min(height[i],height[j]) * (j-i);
                max = Math.max(max, area);
            }
        }
        return max;
    }

    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int max = Math.min(height[left], height[right]) * (right - left);
        while(left<right){
            if(height[left]<=height[right])
                left++;
            else{
                right--;
            }

            max = Math.max(max, Math.min(height[left], height[right])*(right-left));

        }
        return max;

    }


    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};

    }

}
