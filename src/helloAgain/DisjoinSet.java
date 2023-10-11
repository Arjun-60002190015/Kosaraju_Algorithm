package helloAgain;

import java.util.ArrayList;
import java.util.List;

public class DisjoinSet {
    static List<Integer> rank = new ArrayList<>();
    static List<Integer> parent = new ArrayList<>();

    // Setting up the rank and parent array:
    public DisjoinSet(int n){
        for(int i = 0;i<=n;i++){
            rank.add(0);
            parent.add(i);
        }
    }

    // FindParent:

    public  int findParent(int node){
        if(node==parent.get(node)) return node;
        int ulp = findParent(parent.get(node));
        parent.set(node, ulp);
        return parent.get(node);
    }

    // UnionByRank:

    public  void unionByRank(int u, int v){
        int vlp = findParent(v);
        int ulp = findParent(u);
        if(vlp==ulp) return;
        if(rank.get(vlp)>rank.get(ulp)) parent.set(ulp, vlp);
        else if(rank.get(ulp)>rank.get(vlp)) parent.set(vlp, ulp);
        else{
            parent.set(ulp, vlp);
            int rankU = rank.get(ulp);
            rank.set(ulp, rankU+1);
        }
    }

    public static void main(String[] args){
        DisjoinSet ds = new DisjoinSet(7);
        ds.unionByRank(1, 2);
        ds.unionByRank(2, 3);
        ds.unionByRank(4, 5);
        ds.unionByRank(6, 7);
        ds.unionByRank(5, 6);

        if(ds.findParent(3)== ds.findParent(7))
            System.out.println("Same");
        else System.out.println("nope");
        ds.unionByRank(3, 7);

        if(ds.findParent(3)== ds.findParent(7))
            System.out.println("Same");
        else System.out.println("nope");

    }



}
