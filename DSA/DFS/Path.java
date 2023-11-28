import java.util.Iterator;
import java.util.LinkedList;

public class Path {
    private int v;
    private int s;
    private LinkedList<Integer> adj[];

    // constructor
    @SuppressWarnings("unchecked")
    public Path(int v, int s) {
        this.v = v;
        this.s = s;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }

    public void DFSUtilSearch(int v, boolean visited[]) {
        visited[v] = true;
        System.out.println(v + " ");
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (n == s) {
                return;
            } else if (!visited[n]) {
                DFSUtilSearch(n, visited);
            }
        }
    }

    public void searchLoop(int v, boolean[] visited){
        visited[v] = true;
        System.out.println(v + " ");
        Iterator<Integer> i = adj[v].listIterator();
        while(i.hasNext()){
            int n = i.next();
            Iterator<Integer> j = adj[n].listIterator();
            while(j.hasNext()){
                if(n==j.next()){
                    System.out.println("loop found "+ n +" to "+j.next());
                    break;
                }
            }
            if(!visited[n]){
                searchLoop(n, visited);
            }
        }
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public static void main(String[] args) {
        Path p = new Path(4, 0);

        p.addEdge(0, 1);
        p.addEdge(0, 2);
        p.addEdge(1, 2);
        p.addEdge(2, 0);
        p.addEdge(2, 3);
        p.addEdge(3, 3);
        p.addEdge(3, 2);

        boolean[] visited = new boolean[4];
        //p.DFSUtilSearch(3, visited);
        p.searchLoop(0, visited);
    }
}
