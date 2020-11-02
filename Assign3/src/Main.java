import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Can chips = new Can();
		//System.out.println("\nIsEmpty() is "+ chips.isEmpty());
		
		
		//you will need to enter how many chips your Pringles Can can hold into the blank console to start the program
		chips.push("Jalapeno");
		chips.push("Baked Potato");
		chips.push("Barbeque");
		chips.push("Salt And Vineger");
		chips.push("Sour Cream And Onion");
		chips.push("Ranch Dressing");
		chips.show();
		
		//System.out.println("\nIsFull() is "+ chips.isFull());
		System.out.println("\nThe Last chip put in was "+ chips.peek());
		System.out.println("\nThe chip being taken out is "+ chips.pop());
		System.out.println("\nAfter the pop, the stack looks like: ");
		chips.show();
		
	}

}
