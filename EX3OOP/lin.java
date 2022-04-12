//LINEAR SEARCH
import java.util.*;
class lin{
	public static void main(String args[]){
	Scanner s=new
          Scanner(System.in);
	int i,k=0;
	System.out.print("Input\n");
	System.out.print("\n");
	System.out.print("Enter number of elements:");
	int n=s.nextInt();
	int arr[]=new int[n];
	System.out.print("Enter the elements:\n");
	for(i=0;i<n;i++)
 	 {
  	  arr[i]=s.nextInt();
  	}
	System.out.print("Enter the element to search:");
	int a=s.nextInt();
	System.out.print("\n");
          System.out.print("OUTPUT \n");
          System.out.print("___________\n");
	for(i=0;i<n;i++)
	{
	 if(a==arr[i])
	 {
	  System.out.print("Item at index "+i);
	  k=1;
	  break;
	 }
	}
          if(k==0)
         {
	System.out.print("Item not found");
}
}
}
/*
Input

Enter number of elements:3
Enter the elements:
12
13
14
Enter the element to search:15

OUTPUT 
___________
Item not found
java lin
Input

Enter number of elements:
4
Enter the elements:14
15
17
18
Enter the element to search:18

OUTPUT 
___________
Item at index 3
*/

