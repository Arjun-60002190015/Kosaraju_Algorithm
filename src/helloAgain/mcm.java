package helloAgain;

//MCM Memoized

public class mcm {
    static int dp[][] = new int[1001][1001];
    public static int solve(int[] arr){
        for(int i = 0;i<dp.length;i++){
            for(int j = 0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        return helper(arr, 1, arr.length-1);


    }
    public static int helper(int[] arr, int i, int j){
        if(i>=j)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int min = Integer.MAX_VALUE;
        for(int k = i;k<=j-1;k++){
            int temp = helper(arr, i, k) + helper(arr, k+1, j)
                     + arr[i-1] * arr[k] * arr[j];
            if(temp<min)
                min = temp;
        }
        return dp[i][j] = min;

    }

    public static void main(String[] args){
        int[] arr = {40, 20, 30, 10, 30};
        System.out.println(solve(arr));
    }
}
