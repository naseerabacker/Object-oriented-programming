/* to print the number of days in a month for a given year*/
import java.util.Scanner;
class Month
{
  public static void main(String args[])
   { 
    Scanner in=new Scanner(System.in); 
    System.out.print("Enter month: \n");
    int m=in.nextInt();
    System.out.print("Enter year \n");
    int y=in.nextInt();

switch(m)
{
case 1:
   System.out.print("year is "+y+",31 days in january \n");
   break;

case 2: 
   if((y%400==0) || ((y%100!=0)&&(y%4==0)))
   System.out.println(" year is "+y+",29 days in february  ");
   else
   System.out.println("year is "+y+",28days in february");
   break;

case 3:
   System.out.print("year is "+y+",31 days in march \n");
      break;

case 4:
   System.out.print("year is "+y+", 30 days in april \n");
       break;

case 5:
   System.out.print("year is "+y+",31 days in may\n");
       break;

case 6:
   System.out.print(" year is "+y+",30 days in june \n");
       break;

case 7:
   System.out.print("year is "+y+", 31 days in july \n");
       break;

case 8: 
   System.out.print("year is "+y+",30 days in august \n");
       break;
case 9:
   System.out.print("year is "+y+", 30 days in september \n");
       break;

case 10:
   System.out.print("year is "+y+",30 days in october \n");
        break;

case 11:
   System.out.print("year is "+y+", 30 days in november \n");
        break;

case 12:
   System.out.print("year is "+y+",30 days in december \n");
        break;

}
}
}


/*
Enter month: 
4
Enter year 
2000
year is 2000, 30 days in april 

Enter month: 
7
Enter year 
2000
year is 2000, 31 days in july 

Enter month: 
2 
Enter year 
2004
year is 2004,29 days in february  

Enter month: 
2
Enter year 
2005
year is 2005,28days in february
*/


