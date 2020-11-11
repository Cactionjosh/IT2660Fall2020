
public class Node {
	private String value;
	private Node next;
	
	Node(String value){
		this.value = value;
	}
	
	public Node getNextNode() {
		return this.next;
	}
	
	public void setNextNode(Node node) {
		this.next = node;
	}
	
	
	private Node getNodeAtPosition(int position) {
		Node walker = this;
		for (int i = 0; i < position; i++) {
			walker = walker.getNextNode();
		}
		return walker;
	}
	
	public Node insertNodeAtPosition(Node newNode, int position) {
		//We want to insert N at position 2, C or i
		//Access B which is 1 or i - 1
		Node previousNode = getNodeAtPosition(position-1);
		//Set Node N to Node C which is B.next
		newNode.setNextNode(previousNode.getNextNode());
		//Set Node B.Next to Node N
		previousNode.setNextNode(newNode);
		return this;
	}
	
	public Node deleteNodeAtPosition(int position) {
		
		
		//Access previous Node
		Node previousNode = getNodeAtPosition(position-1);
		Node targetNode = getNodeAtPosition(position);
		//set leftnode.next to targetNode.next  Set A.next to C
		previousNode.setNextNode(targetNode.getNextNode());
		
	
		//targetNode.next = null
		targetNode.setNextNode(null);
	
		return this;
	}
	
	
	public void print() {
		Node walker = this;
		System.out.print("[" + this.value + "] ");
		while (walker.getNextNode() != null) {
			walker = walker.getNextNode();
			System.out.print("[" + walker.value + "] ");
		}
	}

	

}
