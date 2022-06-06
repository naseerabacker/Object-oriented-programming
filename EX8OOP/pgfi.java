/* Program to demonstrate the addition and deletion of elements in deque*/



import java.util.*;
public class pgfi
{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        Deque<String> deque = new ArrayDeque<String>();        //Creat Deque  

        System.out.print("Enter the number of elements to be inserted: "); 

						 
        int n=in.nextInt();
        System.out.println("Enter item to add: ");  
        
	for(int i=0;i<n;i++)
        {            
            String s1=in.next();
            deque.add(s1);            
        }
        System.out.println("\nElements in Deque:");
        
        for (String str : deque)
        {
            System.out.println(str);
        }


	deque.poll();            //delete elements from deque
        System.out.println("\nElements after deletion:");
        
        for (String str : deque)
        {
            System.out.println(str);
        }
       
       

    }

}

/*
ksb@ksb-ThinkCentre-Edge72:~/Desktop/EX8OOP$ java pgfi
Enter the number of elements to be inserted: 3
Enter item to add: 
rrt
eee
zz

Elements in Deque:
rrt
eee
zz

Elements after deletion:
eee
zz
ksb@ksb-ThinkCentre-Edge72:~/Desktop/EX8OOP$ 
*/

