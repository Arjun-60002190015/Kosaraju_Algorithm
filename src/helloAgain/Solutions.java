package helloAgain;

import javafx.scene.layout.Priority;

import java.lang.reflect.Array;
import java.util.*;



public class Solutions {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> arr = new Stack<>();
        for(int i = 0;i<asteroids.length;i++){
            if(arr.isEmpty() || asteroids[i]>0){
                arr.push(asteroids[i]);
            }else{
                while(true){
                    int peek = arr.peek();
                    if(peek<0){
                        arr.push(asteroids[i]);
                        break;
                    }else if(peek==-asteroids[i]){
                        arr.pop();
                        break;
                    }else if(peek> -asteroids[i]){
                        break;
                    }else{
                        arr.pop();
                        if(arr.isEmpty()){
                            arr.push(asteroids[i]);
                            break;
                        }
                    }
                }
            }
        }
        int[] res = new int[arr.size()];
        for(int i = arr.size() - 1;i>=0;i--){
            res[i] = arr.pop();
        }
        return res;

    }


    public static void main(String[] args){

        int[] nums = {-5, 8, -14, 2, 4, 12};
        //System.out.println(maxSub(nums, -5));

    }

}
