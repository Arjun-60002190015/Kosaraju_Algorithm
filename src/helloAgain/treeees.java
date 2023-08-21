package helloAgain;

import javafx.scene.layout.Priority;
import sun.reflect.generics.tree.Tree;

import javax.print.DocFlavor;
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
    int max = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    public int[] findFrequentTreeSum(TreeNode root) {

        helper(root);
        List<Integer> res = new ArrayList<>();
        for(int i: map.keySet()){
            if(map.get(i)==max){
                res.add(i);
            }
        }
        int index = 0;
        int[] re = new int[res.size()];
        for(int i:res){
            re[index++] = i;
        }
        return re;

    }

    public int helper(TreeNode root){
        if(root==null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        int sum = left+right+root.val;

        map.put(sum, map.getOrDefault(sum, 0)+1);
        max = Math.max(max, map.get(sum));
        return sum;

    }







}
