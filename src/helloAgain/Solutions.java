package helloAgain;


import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.*;



public class Solutions {
    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student_id, int k) {
        HashSet<String> positive = new HashSet<>();
        for(String i:positive_feedback){
            positive.add(i);
        }
        HashSet<String> negative = new HashSet<>();
        for(String i:negative_feedback){
            negative.add(i);
        }
        //PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[][] arr2 = new int[report.length][2];
        for(int i = 0;i< report.length;i++){
            String[] arr = report[i].split(" ");
            int score = 0;
            for(String n:arr){
                if(positive.contains(n)) score += 3;
                if(negative.contains(n)) score -= 1;
            }
            arr2[i][0] = student_id[i];
            arr2[i][1] = score;
        }
        Arrays.sort(arr2, (a,b)-> a[1]==b[1]? Integer.compare(a[0], b[0]):Integer.compare(b[1], a[1]));
        List<Integer> res = new ArrayList<>();
        for(int i = 0;i<k;i++){
            res.add(arr2[i][0]);
        }
        return res;


    }



    public static void main(String[] args){
        int[] nums = {4, 5, 2, 1};
        int[] quesries = {3, 10, 21};
        //System.out.println()
    }

}
