package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] sub = new int[n*(n+1)/2];
        int k = 0;
        for(int i = 0;i<n;i++){
            int curr = 0;
            for(int j = i;j<n;j++){
                curr += nums[j];
                sub[k++] = curr;

            }

        }

        Arrays.sort(sub);
        int mod = (int)1e9+7;
        int sum = 0;
        for(int i = left-1;i<right;i++){
            sum = (sum+sub[i])%mod;
        }
        return sum;

    }


    public static void main(String[] args){
        int[] nums = {4, 5, 2, 1};
        int[] quesries = {3, 10, 21};
        //System.out.println()
    }

}
