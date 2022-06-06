/* Program to remove an object from the Stack when the position is passed
as parameter*/

import java.util.*;

public class Stac
{
	public static void main(String args[])
	{

		Stack<String> stack = new Stack<String>();

		stack.push("aa");
		stack.push("bb");
		stack.push("cc");
		stack.push("dd");
		stack.push("ee");
		stack.push("ff");

		System.out.println("Stack before removing index position : ");
		Iterator<String> it=stack.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		stack.removeElementAt(4);



		System.out.println("Stack after removing index position 4: ");
		Iterator<String> itr=stack.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	} 
}

/*
ksb@ksb-ThinkCentre-Edge72:~/Desktop/EX8OOP$ javac Stac.java
ksb@ksb-ThinkCentre-Edge72:~/Desktop/EX8OOP$ java Stac
Stack before removing index position : 
aa
bb
cc
dd
ee
ff
Stack after removing index position 4: 
aa
bb
cc
dd
ff

*/
