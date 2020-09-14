import java.util.Scanner;

public class Listing {
	
	static //Variables
	String name;
	static int age;
	

	//Constructor - A constructor in Java is a special method that is used to initialize objects. 
	//The constructor is called when an object of a class is created. 
	//It can be used to set initial values for object attributes
	public Listing(String n, int a)
	{
		name = n;
		age = a;
	}
	
	public String toString()
	{
		return("The name is " + name +
			   " and the age is " + age);
	}
	
	public static void input()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Greetings, please enter your name");
		name = scanner.nextLine();
		
		System.out.println("Great, please enter your age too");
		age = scanner.nextInt();
	
		//to use values in constructor
		//Listing listing = new Listing(name, age);
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String n)
	{
	name = n;	
	}
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int a)
	{
		age = a;
	}
	
	public void outP()
	{
		System.out.println("The name is " + name +
				   " and the age is " + age);
	}
	
	
	
	
}
