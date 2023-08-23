package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {
    public long taskSchedulerII(int[] tasks, int space) {
        Map<Integer, Long> map = new HashMap<>();
        long res = 1;
        int i=  0;
        while(i<tasks.length){
            if(!map.containsKey(tasks[i]) || res>=map.get(tasks[i])){
                map.put(tasks[i], res+space+1);
                res++; i++;
            }
            else{
                res = map.get(tasks[i]);
                map.put(tasks[i], res + space+1);
                res++;
                i++;
            }
        }
        return res-1;

    }



    public static void main(String[] args){
        int[] nums = {4, 5, 2, 1};
        int[] quesries = {3, 10, 21};
        //System.out.println(minimumSum(27, 49));
    }

}
