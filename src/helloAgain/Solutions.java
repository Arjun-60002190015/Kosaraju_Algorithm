package helloAgain;

import com.sun.deploy.security.CredentialManager;
import com.sun.prism.shader.AlphaOne_Color_AlphaTest_Loader;
import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public long totalCost(int[] costs, int k, int candidates) {
        int n = costs.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> {
            if(a[0]==b[0]){
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });

        for(int i = 0;i<candidates;i++){
            pq.offer(new int[]{costs[i], 0});
        }
        for(int i = Math.max(candidates, n - candidates);i<costs.length;i++){
            pq.offer(new int[]{costs[i], 1});
        }
        long asnwer = 0;
        int head = candidates;
        int tail = n-1-candidates;
        for(int i = -0;i<k;i++){
            int[] curr = pq.poll();
            int cost = curr[0];
            int sec = curr[1];
            asnwer += cost;
            if(head<=tail){
                if(sec==0){
                    pq.offer(new int[]{costs[head], 0});
                    head++;
                }else{
                    pq.offer(new int[]{costs[tail], 1});
                    tail--;
                }
            }
        }
        return asnwer;


    }




    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
