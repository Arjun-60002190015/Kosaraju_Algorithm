package helloAgain;

//Palindrome Partitioning recursive

public class mcm {

    public static boolean isP(String s, int i, int j){
        if(s.charAt(i)!=s.charAt(j))
            return false;
        i++;
        j--;

        return true;
    }
    public static int minCut(String s) {
        return helper(s, 0, s.length() - 1);

    }

    public static int helper(String s, int i, int j){
        if(i>=j)
            return 0;
        int min = Integer.MAX_VALUE;
        if(isP(s, i, j))
            return 0;
        for(int k = i;k<j;k++){
            int solve = helper(s, i, k) + helper(s, k+1, j) + 1;
            min = Math.min(min, solve);
        }
        return min;




    }

    public static void main(String[] args){
        String s = "aab";
        System.out.println(minCut(s));
    }
}
