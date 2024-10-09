// Problem Link: https://leetcode.com/problems/number-of-operations-to-make-network-connected

// The following code is solution to the problem in the above link

import java.util.List;
import java.util.ArrayList;

class DisjointSet {
    int[] rank, parent;
    int V;
  
    public DisjointSet(int V) {
        this.V = V;
        rank = new int[V + 1];
        parent = new int[V + 1];

        for (int i = 0; i <= V; i++) {
            parent[i] = i;
        }
    }
    public int findParent(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = findParent(parent[x]);
    }

    public void unionByRank(int u, int v) {
        int rootU = findParent(u);
        int rootV = findParent(v);

        if (rootU == rootV) {
            return; // Already in the same set
        }

        if (rank[rootU] > rank[rootV]) {
            parent[rootV] = rootU;
        } else if (rank[rootU] < rank[rootV]) {
            parent[rootU] = rootV;
        } else {
            parent[rootV] = rootU;
            rank[rootU]++;
        }
    }
}

class Solution {
    public int makeConnected(int n, List<List<Integer>> connections) {
        DisjointSet ds = new DisjointSet(n);

        int extraEdges = 0;

        for (List<Integer> edge : connections) {
            int u = edge.get(0);
            int v = edge.get(1);

            if (ds.findParent(u) != ds.findParent(v)) {
                ds.unionByRank(u, v);
            } else {
                extraEdges++;
            }
        }

        int connectedComponents = 0;

        for (int i = 0; i < n; i++) {
            if (ds.findParent(i) == i) {
                connectedComponents++;
            }
        }

        if (extraEdges >= connectedComponents - 1) {
            return connectedComponents - 1;
        }
        return -1;
    }
}
