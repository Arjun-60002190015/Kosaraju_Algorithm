package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] res = new int[spells.length];
        int n = potions.length;
        for(int i = 0;i< spells.length;i++){
            int start = 0;
            int end = n;
            while(start<end){
                int mid = start + (end-start)/2;
                if((long)potions[mid]*spells[i]>=success){
                    end = mid;
                }else{
                    start = mid+1;
                }

            }
            res[i] = n-start;
        }
        return res;


    }



    public static void main(String[] args){
        List<Integer> res = new ArrayList<>();
        res.add(2);
        res.add(3);
        res.add(3);
        res.add(2);
        res.add(3);
        int[] nums = {2, 3, 4};
        //System.out.println(subarrayLCM(nums, 7));

    }

}
