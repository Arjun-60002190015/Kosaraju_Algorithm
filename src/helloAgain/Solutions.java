package helloAgain;

import javafx.scene.layout.Priority;

import java.sql.Array;
import java.util.*;



public class Solutions {
    public List<String> stringMatching(String[] words) {
        Set<String> set = new HashSet<>();
        for(int i = 0;i< words.length;i++){
            String s = words[i];
            for(int j = 0;j< words.length;j++){
                if(i!=j && words[j].contains(s)){
                    set.add(s);
                }
            }
        }
        return new ArrayList<>(set);

    }






    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4,};

    }

}
