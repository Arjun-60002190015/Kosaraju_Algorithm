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
    ArrayList<Integer> s = new ArrayList<>();

    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);

        Collections.sort(s);
        return s.get(k-1);


    }

    public void dfs(TreeNode root, int k){
        if(root.left!=null)
            dfs(root.left, k);
        s.add(root.val);

        if(s.size()>=k)
            return;
        if(root.right!=null)
            dfs(root.right, k);
    }



    public static void main(String[] args){

    }




}
