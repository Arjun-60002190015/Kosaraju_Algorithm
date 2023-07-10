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
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        int res = 0;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            res++;
            int size = q.size();
            while(size-->0){
                TreeNode curr = q.poll();
                if(curr.left==null && curr.right==null)
                    return res;
                if(curr.right!=null)
                    q.add(curr.right);
                if(curr.left!=null)
                    q.add(curr.left);
            }
        }
        return 0;

    }

    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        if(root.left==null)
            return minDepth(root.right)+1;
        else if (root.right==null) {
            return minDepth(root.left)+1;

        }

        return Math.min(minDepth(root.right), minDepth(root.left))+1;
    }




    public static void main(String[] args){

    }




}
