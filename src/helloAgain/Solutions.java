package helloAgain;


import javafx.scene.layout.Priority;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();
        for(int i = 0;i< words.size();i++){
            String temp = words.get(i);
            String[] arr = temp.split("["+ separator+ "]");
            for(int j = 0;j< arr.length;j++){
                if(arr[j].length()>0){
                    res.add(arr[j]);
                }
            }

        }

        return res;

}






    public static void main(String[] args){
        int[] nums = {2, 3, 7, 9, 3};

        System.out.println(maxArrayValue(nums));

    }

}
