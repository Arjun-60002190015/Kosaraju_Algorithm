package helloAgain;

import javafx.scene.layout.Priority;

import javax.swing.tree.AbstractLayoutCache;
import java.sql.Array;
import java.util.*;



public class Solutions {
    //Recursion
    public int maxProfitRecursion(int[] prices, int fee) {
        return helper(prices, fee, prices.length-1);

    }
    public int helper(int[] prices, int fee, int index){
        if(index==0)
            return 0;
        int max = 0;
        for(int j = index-1;j>=0;j--){
            int selected = prices[index] - prices[j] - fee + helper(prices, fee, j-1);
            int not = helper(prices, fee, index-1);
            max = Math.max(selected, Math.max(not, max));
        }
        return max;
    }
    //Using a Variable Point(Recursion)

    public int maxProfits(int[] prices, int fee) {
        return help(prices, fee, 0, 1);

    }

    public int help(int[] prices, int fee, int index, int point){
        if(index==prices.length)
            return 0;
        int max = 0;
        if(point==1){
            int buy =  -prices[index] + help(prices, fee, index+1, 0);
            int notbuy = help(prices, fee, index+1, 1);
            max = Math.max(buy, Math.max(notbuy, max));
        }
        else{
            int sell = prices[index] - fee + help(prices, fee, index+1, 1);
            int not = help(prices, fee, index+1, 0);
            max = Math.max(not, Math.max(sell, max));
        }
        return max;
    }
    public int maxProfitmemo(int[] prices, int fee) {
        int[][] arr = new int[prices.length][2];
        for(int[] i:arr){
            Arrays.fill(i, -1);
        }
        return helps(prices, fee, 0, 1, arr);
    }

    public int helps(int[] prices, int fee, int index, int point,int[][] memo ){
        if(index==prices.length)
            return 0;
        if(memo[index][point]!=-1)
            return memo[index][point];

        int max = 0;
        if(point==1){
            int buy =  -prices[index] + helps(prices, fee, index+1, 0, memo);
            int notbuy = helps(prices, fee, index+1, 1, memo);
            max = Math.max(buy, Math.max(notbuy, max));
        }
        else{
            int sell = prices[index] - fee + helps(prices, fee, index+1, 1, memo);
            int not = helps(prices, fee, index+1, 0, memo);
            max = Math.max(not, Math.max(sell, max));
        }
        return memo[index][point]=max;
    }
    int[][] memo ;

    public int maxProfit(int[] prices, int fee) {
        memo = new int[prices.length+1][2];
        for(int i = memo.length-2;i>=0;i--){
            for(int j = 0;j<2;j++){
                int max = 0;
                if(j==1){
                    int buy = -prices[i] + memo[i+1][0];
                    int not = memo[i+1][1];
                    max = Math.max(buy, Math.max(max, not));
                }else{
                    int sell = prices[i] - fee + memo[i+1][1];
                    int not = memo[i+1][0];
                    max = Math.max(max, Math.max(not, sell));
                }
                memo[i][j] = max;
            }
        }
        return memo[0][1];


    }

    public static void main(String[] args){
        int[] nums = {0, -1};
        //System.out.println(maxStrength(nums));

    }

}
