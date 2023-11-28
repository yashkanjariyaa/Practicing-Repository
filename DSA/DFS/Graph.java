import java.io.*;
import java.util.*;

public class Graph {
    // not sure why we are declaring this int
    // V is number of vertices in graph
    private int V;
    // a adj array of data type LinkedList<Integer>,
    // LinkedList is a object of a utility class
    private LinkedList<Integer> adj[];

    // constructor
    @SuppressWarnings("unchecked")
    Graph(int v) {
        V = v;
        // declaring a array of data type LinkedList and size v
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            // adding new LinkedList for every index
            adj[i] = new LinkedList();
        }
    }

    // function to add edge into the graph
    void addEdge(int v, int w) {
        // add w to v's list
        adj[v].add(w);
    }

    // util to use by DFSSearch
    void DFSUtil(int v, boolean visited[]) {
        // marking current node as true
        visited[v] = true;
        System.out.print(v + " ");
        // Recur for all the vertices adjacent to this vertex
        // Iterator is object of utility class
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    void DFSSearch(int v) {
        // here small v s=is starting vertice
        // marking all vertices unvisited
        // false by default
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        graph.DFSSearch(0);
    }
}