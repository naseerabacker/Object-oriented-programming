/*input a number and print cube of numbers upto it  */

import java.util.Scanner;
class Cube
{
 public static void main(String args[])
{  
System.out.print("Enter number: \n");
Scanner in=new Scanner(System.in);  
int num=in.nextInt();

int i;
for(i=1;i<=num;i++)
{
System.out.println("Number is "+i+" and its cube is: "+(i*i*i)+"");
}
}
}



/*
Enter number: 
5
number is1 and its cube is:1
number is2 and its cube is:8
number is3 and its cube is:27
number is4 and its cube is:64
number is5 and its cube is:125

*/
