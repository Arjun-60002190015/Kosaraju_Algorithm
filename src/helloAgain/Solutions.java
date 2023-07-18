package helloAgain;


import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    //BruteForce
    public int[] fairCandySwapBF(int[] aliceSizes, int[] bobSizes) {
        int bob = 0;
        int alice = 0;
        for(int i:bobSizes){
            bob += i;
        }
        for(int i:aliceSizes){
            alice +=i;
        }
        for(int i = 0;i<aliceSizes.length;i++){
            for(int j = 0;j<bobSizes.length;j++){
                if(bob - bobSizes[j]+aliceSizes[i]==alice - aliceSizes[i]+bobSizes[j])
                    return new int[]{aliceSizes[i], bobSizes[j]};
            }
        }
        return new int[]{};
    }

    //BinarySearch

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal = 0;
        int bobTotal = 0;
        for (int candies : aliceSizes)
            aliceTotal += candies;
        for (int candies : bobSizes)
            bobTotal += candies;

        Arrays.sort(bobSizes);

        int m = aliceSizes.length, n = bobSizes.length;
        for (int i = 0; i < m; i++) {
            int target = (bobTotal + 2 * aliceSizes[i] - aliceTotal) / 2;
            if (binarySearch(bobSizes, target))
                return new int[] { aliceSizes[i], target };
        }

        return new int[0];
    }

    private boolean binarySearch(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (target < arr[m])
                r = m - 1;
            else if (target > arr[m])
                l = m + 1;
            else
                return true;
        }
        return false;
    }


    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
