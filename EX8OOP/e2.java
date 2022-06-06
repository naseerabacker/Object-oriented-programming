/*Program to remove all the elements from a linked list

*/

import java.util.*;

class e2{
  public static void main(String[] args)
 {
    LinkedList<String> lk = new LinkedList<>();

    // add elements 
    lk.add("Java");
    lk.add("Python");
    lk.addFirst("JavaScript");
    lk.addLast("c");
    lk.add(3,"js");
    System.out.println("LinkedList: " + lk);
    System.out.println("\n");
    // remove elements from index 1
    lk.removeAll(lk);
    

    System.out.println("Updated LinkedList after remove() : " + lk);
    System.out.println("\n");	
    lk.add("bird");
    lk.add("cat");
    lk.add("Script");
    lk.add("chat");
    System.out.println("Updated LinkedList: " + lk);
    System.out.println("\n");
    lk.clear();
    System.out.println("Updated LinkedList after clear(): " + lk);
    System.out.println("\n");
 }
}

/*ksb@ksb-ThinkCentre-Edge72:~/Desktop/EX8OOP$ java e2
LinkedList: [JavaScript, Java, Python, js, c]

Updated LinkedList after remove() : []

Updated LinkedList: [bird, cat, Script, chat]

Updated LinkedList after clear(): []

ksb@ksb-ThinkCentre-Edge72:~/Desktop/EX8OOP$ 
*/

