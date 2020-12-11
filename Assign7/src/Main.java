import java.util.Arrays;
/*
 * The tree needs to maintain the state of being sorted by the students name.
 *  (So instead of comparing numbers to see which one is bigger, you'll need
 *  to Compare Strings) You can't search a binary tree unless it's sorted by 
 *  the primary key, unless you do an exhaustive search, which is inefficient and unrealistic.
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Assuming Sorted List.
        // java.util.Arrays.sort(int[])
		//Chappelle, Foxx, Mulaney, (O'malley: root ), Pera, (Pryor: rightchild), Seinfeld

		 Node rootOdd = new Node(new String [] {"Chappelle","Foxx","Mulaney","O'malley","Pera","Pryor","Seinfeld"});
         Node rootEven = new Node(new String [] {"Chappelle","Foxx","Mulaney","O'malley","Rock","Pera","Pryor","Seinfeld"});
         Node rootEdgeCase1 = new Node(new String [] {"Chappelle"});
         Node rootEdgeCase2 = new Node(new String [] {"Chappelle", "Foxx"});
		
	    String[] People = {"Pera","Mulaney","Foxx","O'malley","Chappelle","Seinfeld","Pryor"};
	    //String[] rootOdd = {"Pera","Mulaney","Foxx","O'malley","Chappelle","Seinfeld","Pryor"};
	    

	   // Arrays.sort(rootOdd);
	    Arrays.sort(People);
	    
	    //java.util.Arrays.sort(String[] values);
	    
	    
	    for(int i=0; i < People.length; i++)
	    {
	    	System.out.println(People[i]);
	    }
	    
	    // print the sorted results
	    for (String persons : People)
	    {
	      //System.out.println(persons);
	    }
	}

}
