import java.util.LinkedList;
import java.util.Queue;

import javax.xml.soap.Node;

public class Main {

	public static void main(String[] args) {
		
		//Depth First Search
		 DFS dps = new DFS(4);
		 //
	       dps.addEdge(1, 3);
	        dps.addEdge(3, 2);
	        dps.addEdge(2, 0);
	        dps.addEdge(2, 1);
	        dps.addEdge(0, 3);
	        dps.addEdge(0, 1);
		 
	        dps.DFSMethod();
	        System.out.println("");
	        System.out.println("");
		
		//Breadth First Search
		 BFS bfs = new BFS(4);
		 
	        bfs.addEdge(0, 1);
	        bfs.addEdge(0, 2);
	        bfs.addEdge(1, 2);
	        bfs.addEdge(2, 0);
	        bfs.addEdge(2, 3);
	        bfs.addEdge(3, 3);

	        for (int i = 0; i < 4; i++) {
	        	bfs.bfsMethod(i);	
	        	System.out.println("");
	        }
	        
		//Dijkstra's Algorithm

	}
	
	public static void printBFS() {
		Queue<Node> queue = new LinkedList<>();
	}

}
