package helloAgain;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode first = list1;
        for(int i = 0;i<a;i++){
            first = first.next;
        }
        ListNode second = first;
        for(int i = a;i<=b;i++){
            second = second.next;
        }
        first.next = list2;
        while(list2.next!=null){
            list2 = list2.next;
        }
        list2.next = second.next;
        return list1;


    }



    public static void main(String[] args){

    }




    }
