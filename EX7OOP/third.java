/*
Define 2 classes; one for generating multiplication
table of 5 and other for displaying first N prime numbers.
Implement using threads. (Thread class)
*/

import java.util.*;

class mul extends Thread //inheriting thread class

{
	 public void run()
	 {
	 System.out.println("Multiplication table 5 \n\n");
	 for(int i=1;i<=10;i++)

	 {
	 System.out.println(i +"*5="+(i*5));
	 }
	 }

}


class pri extends Thread//extending thread class

{
	int n;

	pri(int k)
	{
	  n=k;
	}

	public void run()
	{

		int f=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Prime numbers upto "+ n+"\n\n");

		for(int i=2;i<=n;i++)

		{ 
			f=0;

			for(int j=2;j<=(i/2);j++)
			{

			if((i%j)==0)
			{
			f=1;break;
			}

			}

		if(f==0)
		{
		System.out.println("Prime Number : "+i);
		}
		}
		}
}

class third
{
	public static void main(String args[])
	{

	Scanner s=new Scanner(System.in);
	System.out.println("\n\nEnter Limt:");

	int n=s.nextInt();

	mul p1=new mul();//create object for class sample1

	pri p2=new pri(n);//create object for class sample2

	p1.start();//using that object starting thread

	p2.start();//starting thread by using this object

}

}

/*
ksb@ksb-ThinkCentre-Edge72:~/Desktop/naseeras2/java/EX7OOP$ java third


Enter Limt:
50
Multiplication table 5 


Prime numbers upto 50


Prime Number : 2
Prime Number : 3
Prime Number : 5
Prime Number : 7
Prime Number : 11
Prime Number : 13
Prime Number : 17
Prime Number : 19
Prime Number : 23
Prime Number : 29
Prime Number : 31
Prime Number : 37
Prime Number : 41
Prime Number : 43
Prime Number : 47
1*5=5
2*5=10
3*5=15
4*5=20
5*5=25
6*5=30
7*5=35
8*5=40
9*5=45
10*5=50

*/
