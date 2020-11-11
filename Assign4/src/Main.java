

public class Main {

	public static void main(String[] args) {
		//Insert, Delete, Show
		Node root = new Node("One");
	    root.setNextNode(new Node("Two"));
        root.getNextNode().setNextNode(new Node("Three"));
        
        root = root.insertNodeAtPosition(new Node("Two and a half"), 2);
        root = root.insertNodeAtPosition(new Node("Two and 3 quarters"), 3);

        System.out.println("Linked List before delete: ");
        root.print();
        System.out.println("\n \n ");
        root = root.deleteNodeAtPosition(1);
        System.out.println("Linked List after delete: ");
        root.print();
        
        
        
   
        
        
        

	}

}
