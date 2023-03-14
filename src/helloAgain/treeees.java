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
    int sum = 0;


    public int sumNumbers(TreeNode root) {
        StringBuilder res = new StringBuilder();
        helper(root, res);
        return sum;



    }

    public void helper(TreeNode root, StringBuilder res){
        if(root==null){
            return;
        }
        res.append(root.val);
        if(root.left==null && root.right==null){
            sum += Integer.parseInt(res.toString());
            return;
        }
        helper(root.left, res);
        helper(root.right, res);

    }



    public static void main(String[] args){

    }




}
