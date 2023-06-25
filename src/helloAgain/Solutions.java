package helloAgain;

import com.sun.prism.shader.AlphaOne_Color_AlphaTest_Loader;
import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public long countGood(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long ans = 0;
        long count = 0;
        int start = 0;
        int end = 0;
        while(end< nums.length){
            map.put(nums[end], map.getOrDefault(nums[end], 0)+1);
            count += map.get(nums[end])-1;
            while(count>=k){
                ans += nums.length-end;
                int f = map.get(nums[start]);
                count -= f-1;
                map.put(nums[start], map.get(nums[start])-1);
                if(map.get(nums[start])==0)
                    map.remove(nums[start]);
                start++;
            }
            end++;
        }
        return ans;

    }



    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
