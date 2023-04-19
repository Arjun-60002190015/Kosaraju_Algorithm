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

    int count = 0;
    public int longestZigZag(TreeNode root) {
        if(root==null | (root.left==null && root.right==null))
            return 0;
        dfs(root.left, 1, "left");
        dfs(root.right, 1, "right");
        return count-1;


    }

    public void dfs(TreeNode node, int temp, String res){
        count = Math.max(count, temp);
        if(node==null)
            return;

        if(res=="left"){
            dfs(node.right, temp+1, "right");
            dfs(node.left, 1, "left");
        }
        if(res=="right"){
            dfs(node.left, temp+1, "left");
            dfs(node.right, 1, "right");
        }

    }
















        public static void main(String[] args){

    }




}
