package helloAgain;

import java.util.HashSet;
import java.util.List;

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
    public ListNode removeElements(ListNode head, int val) {

        if(head==null)
            return null;
        ListNode pointer = head;
        while(pointer.next!=null){
            if(pointer.next.val==val)pointer.next = pointer.next.next;
            else pointer = pointer.next;
        }
        return head.val==val?head.next:head;


    }




    }
