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
    HashSet<Integer> set = new HashSet<>();
    public boolean findTargetUsingHashSet(TreeNode root, int k) {
        if(root==null)
            return false;
        if(set.contains(k - root.val))
            return true;
        set.add(root.val);
        findTargetUsingHashSet(root.left, k);
        findTargetUsingHashSet(root.right, k);
        return false;
    }
















        public static void main(String[] args){

    }




}
