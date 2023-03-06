package helloAgain;

//MCM Recursive

public class mcm {
    public static int solve(int[] arr){
        return helper(arr, 1, arr.length-1);

    }
    public static int helper(int[] arr, int i, int j){
        if(i>=j)
            return 0;
        int min = Integer.MAX_VALUE;
        for(int k = i;k<=j-1;k++){
            int temp = helper(arr, i, k) + helper(arr, k+1, j)
                     + arr[i-1] * arr[k] * arr[j];
            if(temp<min)
                min = temp;
        }
        return min;

    }

    public static void main(String[] args){
        int[] arr = {40, 20, 30, 10, 30};
        System.out.println(solve(arr));
    }
}
