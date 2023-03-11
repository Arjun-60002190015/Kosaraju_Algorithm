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

    public boolean isBalancedUnoptimized(TreeNode root) {
        if(root==null)
            return true;
        int left = helper(root.left);
        int right = helper(root.right);
        if(Math.abs(right - left)>1)
            return false;

        boolean leftB = isBalancedUnoptimized(root.right);
        boolean rib  = isBalancedUnoptimized(root.left);
        return leftB && rib;


    }

    public int helper(TreeNode root){
        if(root==null)
            return 0;
        int l = helper(root.left);
        int r = helper(root.right);
        return 1 + Math.max(l, r);
    }

    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        return helpers(root)==-1;


    }

    public int helpers(TreeNode root){
        if(root==null)
            return 0;
        int r = helpers(root.right);
        if(r==-1)
            return -1;
        int l = helpers(root.left);
        if(l==-1)
            return -1;
        if(Math.abs(l-r)>1)
            return -1;
        return 1 + Math.max(l, r);
    }





    public static void main(String[] args){

    }




}
