
/*
 Program to demonstrate the working of Map interface
by adding, changing and removing elements.
*/
import java.util.*;

class nin
{
	public static void main(String args[]) 
	{

		// Create a hash map.
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// Put elements to the map
		hm.put(new Integer(1), "mango");
		hm.put(new Integer(2), "deer");
		hm.put(new Integer(3), "cat");
		hm.put(new Integer(4), "apple");
		hm.put(new Integer(5), "eagle"); 
		System.out.println("The elements are : "+hm);

		//changing elements
		hm.put(new Integer(5), "bat"); 
		System.out.println("eagle changed to bat : "+hm);

		//removing element
		hm.remove(new Integer(4));
		System.out.println("Removed apple : "+hm);

	}
}

/*
ksb@ksb-ThinkCentre-Edge72:~/Desktop/EX9OOP$ java nin
The elements are : {1=mango, 2=deer, 3=cat, 4=apple, 5=eagle}
eagle changed to bat : {1=mango, 2=deer, 3=cat, 4=apple, 5=bat}
Removed apple : {1=mango, 2=deer, 3=cat, 5=bat}
ksb@ksb-ThinkCentre-Edge72:~/Desktop/EX9OOP$ 

*/
