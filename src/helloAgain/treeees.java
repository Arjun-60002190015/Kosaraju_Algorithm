package helloAgain;

import javafx.scene.layout.Priority;
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





    public boolean isSymmetricRecursive(TreeNode root) {
        return helper(root.left, root.right);

    }

    public boolean helper(TreeNode left, TreeNode right){

        if(left==null || right==null)
            return left==right;
        if(left.val!=right.val)
            return false;
        return helper(left.left, right.right) && helper(left.right, right.left);
    }








        public static void main(String[] args){

    }




}
