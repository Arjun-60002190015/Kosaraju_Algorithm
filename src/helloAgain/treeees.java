package helloAgain;

import sun.reflect.generics.tree.Tree;

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



    public ListNode mergeKListsNotOptimal(ListNode[] lists) {
        PriorityQueue<ListNode> q = new PriorityQueue<>((a, b) -> a.val - b.val);
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        for(ListNode list:lists){
            while(list!=null){
                q.add(list);
                list = list.next;
            }
        }
        while(!q.isEmpty()){
            dummy.next = q.poll();
            dummy = dummy.next;
            dummy.next = null;
        }
        return head.next;

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)-> a.val - b.val);
        pq.add(list1);
        pq.add(list2);
        ListNode temp = new ListNode(-1);
        ListNode head = temp;
        while(!pq.isEmpty()){
            ListNode curr = pq.poll();
            temp.next = new ListNode(curr.val);
            temp = temp.next;
            if(curr.next!=null)
                pq.offer(curr.next);
        }
        return head.next;

    }






        public static void main(String[] args){

    }




}
