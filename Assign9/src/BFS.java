import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
	private int Vertex;
	private LinkedList<Integer> adj[];
	
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	public BFS(int v) {
		Vertex = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i) {
			adj[i] = new LinkedList();
		}
	}
	
	public void bfsMethod (int source) {
		boolean visited[] = new boolean[Vertex];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		visited[source] = true;
		queue.add(source);
		
		while(!queue.isEmpty()) {
			source = queue.poll();
            System.out.print(source +" ");
            
            Iterator<Integer> i = adj[source].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
		}
	}
}
