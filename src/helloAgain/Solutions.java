package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i= 0;i< difficulty.length;i++){
            map.put(difficulty[i], Math.max(map.getOrDefault(difficulty[i],0),profit[i]));
        }
        Arrays.sort(difficulty);
        Arrays.sort(worker);
        int sum = 0;
        int start = 0;
        int max = 0;
        for(int i = 0;i< worker.length;i++){
            while(start< difficulty.length && worker[i]>=difficulty[start]){
                max = Math.max(max, map.getOrDefault(difficulty[start], 0));
                start++;
            }
            sum += max;
        }
        return sum;

    }




    public static void main(String[] args){
        List<Integer> res = new ArrayList<>();
        res.add(2);
        res.add(3);
        res.add(3);
        res.add(2);
        res.add(3);
        //System.out.println(canSplitArray(res, 6));

    }

}
