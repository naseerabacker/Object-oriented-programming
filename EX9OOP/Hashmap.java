/*Program to Convert HashMap to TreeMap
*/

import java.util.*;

public class Hashmap
{
	public static void main(String args[]) 
	{
		Map<Integer,String> map = new HashMap< >();
		map.put(1, "aneeta");
		map.put(2, "ambili");
		map.put(3, "anu");
		map.put(4, "anny");
		map.put(5, "mary");
		map.put(6, "ram");
		map.put(7, "reem");
		System.out.println("HashMap = " + map);
		Map<Integer,String> treeMap = new TreeMap< >();
		treeMap.putAll(map);
		System.out.println("TreeMap (HashMap to TreeMap) " + treeMap);
	}
}


/*
ksb@ksb-ThinkCentre-Edge72:~/Desktop/naseeras2/java/EX9OOP$ javac Hashmap.java
ksb@ksb-ThinkCentre-Edge72:~/Desktop/naseeras2/java/EX9OOP$ java Hashmap
HashMap = {1=aneeta, 2=ambili, 3=anu, 4=anny, 5=mary, 6=ram, 7=reem}
TreeMap (HashMap to TreeMap) {1=aneeta, 2=ambili, 3=anu, 4=anny, 5=mary, 6=ram, 7=reem}

*/
