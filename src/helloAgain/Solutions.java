package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long sum = mass;
        for(int i = 0;i<asteroids.length;i++){
            if(sum<asteroids[i]) return false;
            sum += asteroids[i];
        }
        return true;

    }

    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
