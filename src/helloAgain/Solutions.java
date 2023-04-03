package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int res = 0;
        int[] rev = new int[reward1.length];
        for(int i = 0;i< rev.length;i++){
            rev[i] = reward1[i] - reward2[i];
            res += reward2[i];
        }
        Arrays.sort(rev);
        reverse(rev);

        for(int i = 0;i<k;i++){
            res += rev[i];
        }
        return res;
    }
    public void reverse(int[] a){
        int i = 0;
        int j = a.length-1;
        while(i<j){
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
    }



    public static void main(String[] args){
        int[] people = {3, 5, 3, 4};
        int[] potions = {1, 2, 3, 4, 5};
        //System.out.println(numRescueBoats(people, 5));

    }

}
