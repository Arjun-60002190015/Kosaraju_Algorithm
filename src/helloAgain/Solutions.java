package helloAgain;

import com.sun.deploy.security.CredentialManager;
import com.sun.prism.shader.AlphaOne_Color_AlphaTest_Loader;
import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public int maximumProduct(int[] nums, int k) {
        int mod = (int) 1e9+7;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i:nums)
            pq.add(i);
        long prod = 1;
        while(k!=0){
            int i = pq.poll();
            pq.add(i+1);
            k--;
        }
        while(!pq.isEmpty()){
            prod = (prod*pq.poll())%mod;
        }
        return (int) prod;

    }


    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
