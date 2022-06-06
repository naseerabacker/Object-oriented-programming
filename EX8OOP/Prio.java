/* program to demonstrate the creation of queue object using priority queue class
*/


import java.util.*;

public class Prios
{
	public static void main(String args[])
	{

		PriorityQueue<String> queue=new PriorityQueue<String>();

		queue.add("parrot");
		queue.add("peacock");
		queue.add("sparrow");
		queue.add("pigeon");
		System.out.println("Elements in Priority Queue : "+queue);
		
	}
}

/*
ksb@ksb-ThinkCentre-Edge72:~/Desktop/EX8OOP$ javac Prio.java
ksb@ksb-ThinkCentre-Edge72:~/Desktop/EX8OOP$ java Prio
Elements in Priority Queue : [parrot, peacock, sparrow, pigeon]


*/

