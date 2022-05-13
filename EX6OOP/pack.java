/*
 Create a Graphics package that has classes and interfaces for
figures Rectangle, Triangle, Square and Circle. Test the package by
finding the area of these figures.
*/

import java.util.*;
import Graphics.*;

class pack
{
  public static void main(String args[])
  {
    int a,b,c,x,y,r;
    Scanner s=new Scanner(System.in);
    while(true)
    {
    System.out.println("1.Rectangle\n2.Square\n3.Triangle\n4.Circle\n5.EXIT\n\nENTER CHOICE : ");
    int ch=s.nextInt();
    switch(ch)
    {
       case 1:System.out.println("Enter Length and breadth of rectangle:");
              a=s.nextInt();
              b=s.nextInt();
              Rectangle obj1=new Rectangle();//create object 
              obj1.area(a,b);
              break;

       case 2:System.out.println("Enter side of square:");
              c=s.nextInt();
              Square obj2=new Square();
 	    obj2.area(c,1);
              break;

       case 3:System.out.println("Enter base and height of triangle : ");
              x=s.nextInt();
              y=s.nextInt();
              Triangle obj3=new Triangle();
              obj3.area(x,y);
              break;

       case 4:System.out.println("Enter radius of circle :");
               r=s.nextInt();
              Circle obj4=new Circle();
              obj4.area(r);
              break;

       case 5:System.out.println("EXITING... ");
               System.exit(0);
     
       default:System.out.println("INVALID OPTION...");
    }
    }
  }

}



/*
1.Rectangle
2.Square
3.Triangle
4.Circle
5.EXIT

ENTER CHOICE : 
1
Enter Length and breadth of rectangle:
3
4
AREA OF RECTANGLE : 12

1.Rectangle
2.Square
3.Triangle
4.Circle
5.EXIT

ENTER CHOICE : 
2
Enter side of square:
4
AREA OF SQUARE : 16

1.Rectangle
2.Square
3.Triangle
4.Circle
5.EXIT

ENTER CHOICE : 
3
Enter base and height of triangle : 
4
5
AREA OF TRIANGLE : 10.0

1.Rectangle
2.Square
3.Triangle
4.Circle
5.EXIT

ENTER CHOICE : 
4
Enter radius of circle :
3
AREA OF CIRCLE : 28.26

1.Rectangle
2.Square
3.Triangle
4.Circle
5.EXIT

ENTER CHOICE : 
5
EXITING... 


*/






