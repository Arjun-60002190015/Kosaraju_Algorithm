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
    List<Integer> res;
    Map<Integer, List<Integer>> graph;
    Set<Integer> visited;
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        graph = new HashMap<>();
        buildGraph(root, null);
        res = new ArrayList<>();
        visited = new HashSet<>();
        visited.add(target.val);

        dfs(target.val, 0, k);

        return res;
    }

    public void buildGraph(TreeNode curr, TreeNode parent){
        if(curr!=null && parent!=null){
            graph.computeIfAbsent(curr.val, k-> new ArrayList<>()).add(parent.val);
            graph.computeIfAbsent(parent.val, k-> new ArrayList<>()).add(curr.val);
        }
        if(curr.left!=null)
            buildGraph(curr.left, curr);
        if(curr.right!=null)
            buildGraph(curr.right, curr);

    }

    public void dfs(int curr, int level, int k) {
        if (level == k){
            res.add(curr);
            return;
        }

        for(int i:graph.getOrDefault(curr, new ArrayList<>())){
            if(!visited.contains(i)){
                visited.add(i);
                dfs(i, level+1, k);
            }
        }
    }




    public static void main(String[] args){

    }




}
