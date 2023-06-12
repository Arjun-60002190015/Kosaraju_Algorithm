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
    int level = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return level-1;
    }

    public int helper(TreeNode root){
        if(root==null)
            return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        level = Math.max(level, left+right+1);
        return Math.max(left, right)+1;
    }




    public static void main(String[] args){

    }




}
