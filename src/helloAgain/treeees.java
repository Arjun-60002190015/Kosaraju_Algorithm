package helloAgain;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

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
    public boolean isEvenOddTree(TreeNode root) {
        LinkedList<TreeNode> q = new LinkedList<>();
        q.addLast(root);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int level = 0;
        while(!q.isEmpty()){
            ArrayList<Integer> temp = new ArrayList<>();
            int size = temp.size();
            while(size-- >0){
                TreeNode curr = q.removeFirst();
                if(level%2==0){
                    if(curr.val%2==0)
                        return false;
                }
                if(level%2!=0){
                    if(curr.val%2!=0)
                        return false;
                }
                temp.add(curr.val);
                if(curr.left!=null)
                    q.addLast(curr.left);
                if(curr.right!=null)
                    q.addLast(curr.right);

            }
            res.add(temp);
            level++;
        }
        int l = 0;
        for(ArrayList<Integer> list:res){
            if(l%2==0){
                for(int i = 1;i< list.size();i++){
                    if(list.get(i-1)>=list.get(i))
                        return false;
                }
            }else{
                for(int i = 1;i< list.size();i++){
                    if(list.get(i-1)<=list.get(i))
                        return false;
                }
            }
            l++;
        }
        return true;

    }



    public static void main(String[] args){

    }




    }
