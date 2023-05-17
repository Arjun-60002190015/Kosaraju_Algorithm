package helloAgain;

import javafx.scene.layout.Priority;
import sun.reflect.generics.tree.Tree;

import javax.transaction.TransactionRequiredException;
import java.util.*;

public class treeees {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }


    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }

    public int pairSum(ListNode head) {
        List<Integer> res = new ArrayList<>();
        ListNode curr = head;
        while(curr!=null){
            res.add(curr.val);
            curr = curr.next;
        }
        int min = 0;
        for(int i = 0;i<res.size()/2;i++){
            int sum  = res.get(i) + res.get(res.size() - 1- i);
            if(sum>min)
                min = sum;
        }
        return min;


    }

















        public static void main(String[] args){

    }




}
