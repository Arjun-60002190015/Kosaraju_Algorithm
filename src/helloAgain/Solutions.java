package helloAgain;


import javafx.scene.layout.Priority;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.sql.Array;
import java.util.*;



public class Solutions {
    public double myPow(double x, int n) {
        if(n>=0){
            return helper(x, n);
        }else{
            return 1/helper(x, n);
        }
    }

    public double helper(double x, int n){
        if(n==0) return 1;
        double res = helper(x, n/2);
        if(n%2!=0)
            return res*res*x;
        return res*res;
    }

}
