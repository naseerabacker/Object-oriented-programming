//Add two complex numbers

import java.util.*;
class com
{
 int r;
 int i;

com(int a,int b)// initialise
{
 r=a;
 i=b;
}
public static void main(String arg[])
{
 int c;
 int d;
 Scanner s=new Scanner(System.in);//creating scanner class object

   System.out.print("\n");
   System.out.print("INPUT\n");
   System.out.print("______ \n");
   System.out.print("\n");

  System.out.println("Enter Real and Imaginary Part of First Complex Number: 	");
  int x=s.nextInt();
  int y=s.nextInt();
  com obj1=new co(x,y);//passing
  System.out.println("Enter Real and Imaginary Part of Second Complex Number: ");

  int p=s.nextInt();
  int q=s.nextInt();
  com obj2=new co(p,q);//passing
  c=obj1.r+obj2.r;//add real part
  d=obj1.i+obj2.i;//add img part

  System.out.print("\n");
  System.out.print("OUTPUT\n");
  System.out.print("______ \n");
  System.out.print("\n");
  System.out.println("SUM OF COMPLEX NUMBERS: "+c+"+i"+d);


}
}
/*

INPUT
______ 

Enter Real and Imaginary Part of First Complex Number: 	
3
8
Enter Real and Imaginary Part of Second Complex Number: 
0
2

OUTPUT
______ 

SUM OF COMPLEX NUMBERS: 3+i10
*/



