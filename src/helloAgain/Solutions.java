package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    boolean[] vis;
    int ans = 0;

    public int countArrangement(int n) {
        vis = new boolean[n+1];
        helper(n, 1);
        return ans;
    }

    public void helper(int n, int index){
        if(index>n) {
            ans++;
            return;
        }

        for(int i = 1;i<=n;i++){
            if(!vis[i] && (i%index==0 || index%i==0)){
                vis[i] = true;
                helper(n, index+1);
                vis[i] = false;
            }
        }
    }


    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
