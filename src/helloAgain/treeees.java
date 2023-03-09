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
    HashSet<ListNode> set = new HashSet<>();

    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while(curr!=null && curr.next!=null){
            if(curr.val==curr.next.val)
                curr.next = curr.next.next;
            else curr = curr.next;
        }
        return head;

    }



    }
