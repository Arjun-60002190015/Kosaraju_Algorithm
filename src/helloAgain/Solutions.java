package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public static int numRescueBoats(int[] people, int limit) {
        int count = 0;
        Arrays.sort(people);
        int start = 0;
        int end = people.length-1;
        while(start<=end) {
            if (people[end] + people[start] <= limit){
                start++;
                end--;
            }
            else{
                end--;
            }
            count++;
        }
        return count;

    }



    public static void main(String[] args){
        int[] people = {3, 5, 3, 4};
        int[] potions = {1, 2, 3, 4, 5};
        System.out.println(numRescueBoats(people, 5));

    }

}
