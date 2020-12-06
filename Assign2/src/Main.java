
public class Main {

	public static void main(String[] args) {
		// Please input the array length in the console after clicking run. 
		
		arrayMethods theClass = new arrayMethods();
		 theClass.insert("Ed", 0);
		 theClass.insert("Eddie", 1);
		 theClass.insert("Edward", 2);
		 theClass.insert("Edwin", 3);
		 theClass.insert("Eduardo", 4);
		 theClass.insert("Eddy", 5);
		 theClass.insert("Eee-Dee", 6);
		 System.out.println("List after insertion");
		 theClass.print();
		 
		 theClass.delete(2);
		 System.out.println();
		 System.out.println();
		 System.out.println("List after deletion at index 2");
		 theClass.print();
		 
		 theClass.update("Josh", 0);
		 System.out.println();
		 System.out.println();
		 System.out.println("List after update at index 0");
		 theClass.print();
		 
		 System.out.println();
		 System.out.println();
		 System.out.print("After the append, the last item in the list is: ");
		 theClass.append("Edmonton");
	}

}
