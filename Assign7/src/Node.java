import java.util.Arrays;


	public class Node {
		private String value;
		private int id;
		private Node leftChild;
	    private Node rightChild;
	    
	    public Node(String value, int id){
			this.value = value;
			this.id = id;
		}
	    
	    public void getID(int id){
			this.id = id;
		}
	    
	    public Node (String[] values) {
	    	
	    	int length = values.length;
	    	
	    	switch (length) {
	    	//base case
	    	case 1: 
	    		this.value = values[0];
	    		return;
	    	case 2: // Base Case 2
               
	    		
	    		
	    		// int min = Math.min(id[0], id[1]);
               // int max = Math.max(values[0], values[1]);
               // this.value = max;
               // this.leftChild = new Node(min);      
	    		
	    		
	    		
	    	 default: // Recursion
	                int median = length / 2;
	                String[] leftArray = Arrays.copyOfRange(values, 0, median);
	                String[] rightArray = Arrays.copyOfRange(values, median + 1, values.length);
	                if (leftArray.length > 0) this.leftChild = new Node(leftArray);
	                this.value = values[median];
	                if (rightArray.length > 0) this.rightChild = new Node(rightArray);
	    	}
	    }

	
		

		
	}

