/* 
Create an Arithmetic package that has classes and interfaces
for the four basic arithmetic operations. Test the package by
implementing all operations on two given numbers

*/


import java.util.*;

import arithmetics.*;//import arithmetic package

class Ari

{
  public static void main(String args[])
  {
    int a,b,c,x,y,r;
    Scanner s=new Scanner(System.in);

    while(true)
    {
    System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit\n\n  ENTER CHOICE : ");
        int ch=s.nextInt();
        if(ch==5)
	{
	  System.out.println("EXITING... ");
	  break;
	}
           System.out.println("Enter 2 numbers for operation:");
           a=s.nextInt();
           b=s.nextInt();
    switch(ch)
    {
       case 1:
              add obj1=new add();//create object of class in package
              obj1.fucn(a,b);
              break;
       case 2:
              sub obj2=new sub();
              obj2.fucn(a,b);
              break;
       case 3:
              mul obj3=new mul();
              obj3.fucn(a,b);
              break;
       case 4:
               if(b==0)
		{
		System.out.println("Division not possible...\n");
                    }
               else{
		div obj4=new div();
                    obj4.fucn(a,b);
		}
               break;
       default:System.out.println("Invalid option...");
	Scanner p=new Scanner(System.in);
    }
   }

  }

}

/*
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.Exit

  ENTER CHOICE : 
1
Enter 2 numbers for operation:
2
3

 SUM OF NUMBERS :5

1.Addition
2.Subtraction
3.Multiplication
4.Division
5.Exit

  ENTER CHOICE : 
2
Enter 2 numbers for operation:
2
3
DIFFERENCE OF NUMBERS : -1

1.Addition
2.Subtraction
3.Multiplication
4.Division
5.Exit

  ENTER CHOICE : 
3
Enter 2 numbers for operation:
2
3
PRODUCT OF NUMBERS : 6

1.Addition
2.Subtraction
3.Multiplication
4.Division
5.Exit

  ENTER CHOICE : 
4
Enter 2 numbers for operation:
2
0
Division not possible...

1.Addition
2.Subtraction
3.Multiplication
4.Division
5.Exit

  ENTER CHOICE : 
4
Enter 2 numbers for operation:
2
3
Division : 0
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.Exit

  ENTER CHOICE : 
4
Enter 2 numbers for operation:
2
2
Division : 1

1.Addition
2.Subtraction
3.Multiplication
4.Division
5.Exit

  ENTER CHOICE : 
5
EXITING... 



