import java.util.Scanner;

public class arrayMethods {

	Scanner scanner = new Scanner(System.in);
	int s = scanner.nextInt();
	//int s = 5;
	String arr[] = new String[s];

	
	public void insert(String name, int position) {
		//int j = position;

		if (position < 0 || position > arr.length) {
            return;
        }	
		
		if (position < arr.length) {
			arr[position] = name;	
		}
		else {
			System.out.print("One or more of these entries could not be added to the list.  \n" );
			System.out.println();
			System.out.println();
		}
	}
	
	public void delete( int position) {
		if (position < 0 || position > arr.length) {
            return;
        }	
		arr[position] = null;	
	}
	
	public void update(String name, int position) {
		if (position < 0 || position > arr.length) {
            return;
        }	
		arr[position] = name;
	}
	
	public void append(String name) {
		s++;
		 arr[arr.length - 1] = name;
		 System.out.print(name);  
	}
	
	public void print() {
		 for(int i = 0; i < s; i++) {
			 if(arr[i] != null) {
				 System.out.print(i + ". " + arr[i] + " \n");   	 
			 	}
			 }
	}
	
}
