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

    //Swapping values
    public ListNode swapNode(ListNode head, int k) {
        ListNode left = head;
        ListNode right = head;
        int count =0 ;
        while(left!=null){
            count++;
            if(count==k)
                break;

            left = left.next;
        }

        ListNode p = left;
        while(p.next!=null){
            p = p.next;
            right = right.next;
        }

        int temp = left.val;
        left.val = right.val;
        right.val = temp;

        return head;

    }

    //swapping nodes
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode preLeft = dummy;
        ListNode left = head;
        ListNode preRight = dummy;
        ListNode right = head;

        for(int i = 1;i<k;i++){
            preLeft = preLeft.next;
            left = left.next;
        }

        ListNode curr = left;
        while(curr.next!=null){
            curr = curr.next;
            preRight = preRight.next;
            right = right.next;
        }

        ListNode temp = left.next;
        if(preLeft==right){
            preLeft.next = left;
            left.next = right;
            right.next = temp;
        }
        else if(left==preRight){
            left.next = right.next;
            preLeft.next = right;
            right.next = left;
        }else{
            preLeft.next = right;
            left.next = right.next;
            preRight.next = left;
            right.next = temp;
        }
        return dummy.next;
    }


















        public static void main(String[] args){

    }




}
