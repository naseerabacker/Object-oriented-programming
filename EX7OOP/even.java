/*
 Define 2 classes; one for generating Fibonacci
numbers and other for displaying even numbers in a
given range. Implement using threads. (Runnable
Interface)
*/


import java.util.*;

class w1 implements Runnable//implementing runnable interface

{
   Scanner s=new Scanner(System.in);
   int n;

w1(int k)
{
  n=k;
}

public void run()
{

	System.out.println("\nFibonacci series upto "+n+" terms\n\n");
	int a=0,b=1,c=0;
	for(int i=1;i<=n;i++)

	{

	System.out.println("Fibonacci : "+c);
	a=b;
	b=c;
	c=a+b;

	}
}
}

class w2 implements Runnable

{

	int n1,n2;
	w2(int x,int y)
	{

	n1=x;
	n2=y;

	}
public void run()
{
	for(int i=n1;i<=n2;i++)
	{
	if(i%2==0)
	{
	System.out.println("Even Number : "+i);
	}

}

}

}

class even
{
	public static void main(String args[])

{
	Scanner s=new Scanner(System.in);
	System.out.println("\n\nEnter Limt for fibonacci series:");
	int n=s.nextInt();
	System.out.println("\n\nEnter range for even numbers:");
	int n1=s.nextInt();
	int n2=s.nextInt();
	w1 th1=new w1(n);//create object 
	Thread t1=new Thread(th1);//create thread object
	t1.start();//start thread

	w2 th2=new w2(n1,n2);//create object of class sample 2
	Thread t2=new Thread(th2);//create thread object with the abve class object

	t2.start();//start thread


}

}

/*
ksb@ksb-ThinkCentre-Edge72:~/Desktop/naseeras2/java/EX7OOP$ javac even.java
ksb@ksb-ThinkCentre-Edge72:~/Desktop/naseeras2/java/EX7OOP$ java even


Enter Limt for fibonacci series:
10


Enter range for even numbers:
2
8
Even Number : 2
Even Number : 4
Even Number : 6
Even Number : 8

Fibonacci series upto 10 terms


Fibonacci : 0
Fibonacci : 1
Fibonacci : 1
Fibonacci : 2
Fibonacci : 3
Fibonacci : 5
Fibonacci : 8
Fibonacci : 13
Fibonacci : 21
Fibonacci : 34
ksb@ksb-ThinkCentre-Edge72:~/Desktop/naseeras2/java/EX7OOP$ 

*/
