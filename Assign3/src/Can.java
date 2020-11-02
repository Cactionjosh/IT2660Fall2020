import java.util.Scanner;



public class Can {
	
	Scanner scanner = new Scanner(System.in);
	int s = scanner.nextInt();
	String stack[] = new String[s];
    int top = -1;
	
	
	public boolean isEmpty()
	{
		return top <= -1;
	}
	
	public boolean isFull()
	{
		return top == (s-1);
	}
	
	public void push(String chip)
	{
		if (!isFull()) 
		{	
				top++;
				stack[top] = chip;
		}else {
			System.out.println("The Stack is full! This chip didn't fit");		
		}	
	}
	

	public String pop()
	{
	
		if (!isEmpty()) {
			String chip;
			chip = stack[top];
			stack[top] = null;
			return chip;		
		}
		else
		{
			System.out.println("The Stack is already empty");	
			return null;
		}
	}
	
	
	public String peek()
	{
		
		String chip;
		chip = stack[top];
		return chip;
	}
	
	public void show()
	{
		for(String n : stack)
		{
			System.out.print( n + " \n");
		}
		
	}
}
