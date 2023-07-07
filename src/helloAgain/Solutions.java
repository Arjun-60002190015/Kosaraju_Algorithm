package helloAgain;


import java.sql.Array;
import java.util.*;



public class Solutions {
    HashMap<List<Integer>, Integer> map = new HashMap<>();
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        return helper(price, special, needs);
    }

    public int helper(List<Integer> price, List<List<Integer>> special, List<Integer> needs){
        int min = getPrice(needs, price);
        if(map.get(needs)!=null){
            return map.get(needs);
        }

        for(int i = 0;i< special.size();i++){
            boolean flag = true;
            List<Integer> offer = special.get(i);
            List<Integer> newNeeds = new ArrayList<>();
            for(int k = 0;k<offer.size()-1;k++){
                if(needs.get(k)<offer.get(k)){
                    flag = false;
                    break;
                }
                newNeeds.add(needs.get(k) - offer.get(k));
            }
            if(!flag){
                continue;
            }
            min = Math.min(min, offer.get(offer.size()-1) + helper(price, special, newNeeds));
        }
        map.put(needs, min);
        return min;
    }

    public int getPrice(List<Integer> needs, List<Integer> price){
        int min = 0;
        for(int i = 0;i<needs.size();i++){
            min += needs.get(i)*price.get(i);
        }
        return min;
    }






    public static void main(String[] args){
        int[] n = {2, 2, 3, 4, 4, 5, 5};
        //System.out.println(singleNumber(n));

    }

}
