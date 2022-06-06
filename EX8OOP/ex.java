/*
 Maintain a list of Strings using ArrayList from collection
framework, perform built-in operations
*/



import java.util.*;  
class ex
{  
  public static void main(String args[])
{  
     ArrayList<String> al=new ArrayList<String>();  
     al.add("flower");  
     al.add("animals");  
     al.add("lobster");  
     al.add("rhinoser"); 
     al.add("lannister");
  
     
	 
          System.out.println(al);  //total elements
          System.out.println("Number of elements in ArrayList: "+al.size());
	System.out.println("\n");
	

          al.add(2, "goat");//add
          al.add(1, "peacock");
          System.out.println("ArrayList after add operation:"+al);
          System.out.println("\n");

          String val=al.get(3);//add
	al.add(val+"kkkk");  
          System.out.println("ArrayList after add operation:"+al);
	System.out.println("\n");


          al.remove("lobster");//remove
	al.remove(2);
	System.out.println("ArrayList after remove operation:"+al);
	System.out.println("\n");


	Collections.sort(al);//sort
	System.out.println("ArrayList after sort operation:"+al);
	System.out.println("\n");

          al.set(2, "cat");//set
	System.out.println("ArrayList after set operation:"+al);
	System.out.println("\n");

	
	al.set(4,val+"gggg");//set
          System.out.println("ArrayList after set operation:"+al);
	System.out.println("\n");

          
	
     }  
}

/*
ksb@ksb-ThinkCentre-Edge72:~/Desktop/net script$ javac ex.java
ksb@ksb-ThinkCentre-Edge72:~/Desktop/net script$ java ex
[flower, animals, lobster, rhinoser, lannister]
Number of elements in ArrayList: 5


ArrayList after add operation:[flower, peacock, animals, goat, lobster, rhinoser, lannister]


ArrayList after add operation:[flower, peacock, animals, goat, lobster, rhinoser, lannister, goatkkkk]


ArrayList after remove operation:[flower, peacock, goat, rhinoser, lannister, goatkkkk]


ArrayList after sort operation:[flower, goat, goatkkkk, lannister, peacock, rhinoser]


ArrayList after set operation:[flower, goat, cat, lannister, peacock, rhinoser]


ArrayList after set operation:[flower, goat, cat, lannister, goatgggg, rhinoser]



*/
