import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Listing listing = new Listing(null, 0);
		Scanner scanner = new Scanner(System.in);
		Listing.input();
		
		
		listing.setName(Listing.name);
		listing.getName();
		
		listing.setAge(Listing.age);
		listing.getAge();
		
		listing.outP();
		listing.toString();


	}
}
