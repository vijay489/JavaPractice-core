package org.example.Graphs;

import java.util.LinkedList;

public class BFSofGraph {
    int ver;
    LinkedList<Integer>[] adj;
    BFSofGraph(int d){
        ver = d;
        adj = new LinkedList[d];
        for(int i=0;i<ver;++i){
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w){
        adj[v].add(w);
    }

    public static void main(String[] args){
        BFSofGraph graph = new BFSofGraph(4);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(2,0);
        graph.addEdge(2,3);
        graph.addEdge(3,3);

        graph.bfs(2);
    }

    private void bfs(int startVer) {
        boolean[] visited = new boolean[ver];
        LinkedList<Integer> queue = new LinkedList<>();

        queue.add(startVer);
        visited[startVer] = true;

        while (!queue.isEmpty()){
            startVer = queue.poll();
            System.out.print(startVer+" ");

            for(Integer d : adj[startVer])
            {
                if(!visited[d])
                {
                    visited[d] = true;
                    queue.add(d);
                }
            }
        }
    }
}
