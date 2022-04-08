/* input floating number and check   */
import java.util.Scanner;
class Float
{
 public static void main(String args[])
{
System.out.print("Enter number: \n");
Scanner in=new Scanner(System.in);  
float num=in.nextFloat();


if(num==0)
{
System.out.print("zero\n");
}
else if(num<0)
{

if(Math.abs(num)>100000)
System.out.print("larger negative\n");
else if(Math.abs(num)<1)
System.out.print("small negative\n");
else
System.out.print("negative");
}

 else
 {
 if(Math.abs(num)>100000)
 System.out.print("larger positive\n");
 else if(Math.abs(num)<1)
System.out.print("small positive\n");
else
System.out.print("positive");
}
}
}


/*Enter number: 
100001.0
larger positive

Enter number: 
-100001.0
larger negative

Enter number: 
-6.0

Enter number: 
6.0

Enter number: 
-0.3
small negative

Enter number: 
0.9
small positive
*/

