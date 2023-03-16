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


    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int len = inorder.length;
        return helper(inorder, postorder, 0, len - 1, 0, len - 1);


    }

    public TreeNode helper(int[] inorder, int[] postorder, int inS, int inE, int poS, int poE){
        if(inS>inE)
            return null;
        int rootVal = postorder[poE];
        TreeNode root = new TreeNode(rootVal);
        int index = inS;
        for(;index<=inE;index++){
            if(inorder[index]==index)
                break;
        }
        int left = index - inS;
        int right = inE - index;

        root.left = helper(inorder, postorder, inS, index - 1, poS, poS + index-1);
        root.right = helper(inorder, postorder, index + 1, inE, poE - right, poE - 1);
        return root;
    }



    public static void main(String[] args){

    }




}
