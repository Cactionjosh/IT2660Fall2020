import java.util.Iterator;
import java.util.LinkedList;

public class DFS {

    private int Vertex; 
    private LinkedList<Integer> adj[];
 

    DFS(int v)
    {
        Vertex = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }
 
   
    void addEdge(int v, int w) {
        adj[v].add(w); 
    }
 

    void DFSMethod()
    {
        boolean visited[] = new boolean[Vertex];
        for (int i = 0; i < Vertex; ++i) {
        	
        }
      
    }
}