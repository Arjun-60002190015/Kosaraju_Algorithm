package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {
    int mod = (int)1e9+7;
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        TreeSet<Integer> set = new TreeSet<>();
        int res = 0;
        int reduce = 0;
        for(int i:nums1) set.add(i);

        for(int i = 0;i< nums2.length;i++){
            int diff = Math.abs(nums1[i] - nums2[i]);

            res = (res + diff)%mod;
            Integer low = set.floor(nums2[i]);
            if(low!=null){
                reduce = Math.max(reduce, diff - Math.abs(nums2[i] - low));
            }
            Integer high = set.ceiling(nums2[i]);
            if(high!=null){
                reduce = Math.max(reduce, diff - Math.abs(nums2[i] - high));
            }
        }
        return (res - reduce+mod)%mod;
    }



    public static void main(String[] args){
        int[] nums = {4, 5, 2, 1};
        int[] quesries = {3, 10, 21};
        //System.out.println(minimumSum(27, 49));
    }

}
