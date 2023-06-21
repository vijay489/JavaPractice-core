package org.example.Graphs;

import java.util.LinkedList;

public class DFSofGraph {
    int ver;
    LinkedList<Integer> adj[];

    DFSofGraph(int d) {
        ver = d;
        adj = new LinkedList[ver];
        for (int i = 0; i < ver; ++i)
            adj[i] = new LinkedList<>();
    }


    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public static void main(String[] args) {
        DFSofGraph graph = new DFSofGraph(4);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(2,0);
        graph.addEdge(2,3);
        graph.addEdge(3,3);

        System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");
        graph.dfs(2);
    }

    private void dfs(int i) {
        boolean[] visited = new boolean[ver];
        dfsUtil(i,visited);
    }

    private void dfsUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v+" ");

        for(Integer d : adj[v]) {
            if(!visited[d])
                dfsUtil(d,visited);
        }
    }
}
