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
    int min = Integer.MAX_VALUE;
    TreeNode parent = null;
    public int getMinimumDifference(TreeNode root) {
        if(root.left!=null) getMinimumDifference(root.left);

        if(parent!=null){
            min = Math.min(root.val - parent.val, min);
        }
        parent = root;

        if(root.right!=null) getMinimumDifference(root.right);
        return min;

    }




    public static void main(String[] args){

    }




}
