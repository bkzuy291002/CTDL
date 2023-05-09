package CTDL.HW8;

import java.util.ArrayList;
import java.util.List;

public class EdgeWeightedGraph {
    private final int V;
    private int E;
    private List<Edge>[] adj;

    public EdgeWeightedGraph(int V) {
        this.V = V;
        this.E = 0;
        this.adj = (List<Edge>[]) new List[V];
        for (int v = 0; v < V; v++) {
            this.adj[v] = new ArrayList<>();
        }
    }
    public int V() { return V; }
    public int E() { return E; }
    public void addEdge(Edge e) {
        int v = e.either(), w = e.other(v);
        adj[v].add(e);
        adj[w].add(e);
        E++;
    }
    public Iterable<Edge> adj(int v) { return adj[v]; }
}
