//area of shapes by method overloading
import java.util.*;
class ovr
{

//overloading area method
void area(int a,int b)
{
  System.out.println("AREA OF RECTANGLE: "+(a*b));
}
void area(int x)
{
  System.out.println("AREA OF SQUARE: "+(x*x));
}

void area(float r,int i,int j)
{
  System.out.println("AREA OF CIRCLE: "+(3.14*r*r));
}
 public static void main(String args[])
           {
             Scanner s=new Scanner(System.in);//CREATING SCANNER CLASS OBJECT
             System.out.print("INPUT\n");
             System.out.print("\n");
             ovr obj=new ovr();//creating object
             System.out.println("1.RECTANGLE\n2.SQUARE\n3.CIRCLE\n\nEnter your Choice:  ");
           int ch=s.nextInt();
           int a,b,c,d,rad;
           float ar;

          /* System.out.print("\n");
              System.out.print("OUTPUT\n");
             System.out.print("______ \n");*/
        //for menu driven
          switch(ch)
          {
           case 1:System.out.println("Enter length and breadth: ");
                  a=s.nextInt();
                   b=s.nextInt();
                   obj.area(a,b);//invoking area
                   break;

            case 2:System.out.println("Enter length : ");
                  	c=s.nextInt();
 		obj.area(c);//invoking area
                    break;

            case 3:System.out.println("Enter Radius : ");
                  rad=s.nextInt();
                  obj.area(rad,0,0);//invoking area
  	        break;
           default:System.out.println("INVALID INPUT.... ");
                   break;
           }


}
}

/*INPUT
INPUT

1.RECTANGLE
2.SQUARE
3.CIRCLE

Enter your Choice:  
1
Enter length and breadth: 
3
3
AREA OF RECTANGLE: 9

$ java ovr
INPUT

1.RECTANGLE
2.SQUARE
3.CIRCLE

Enter your Choice:  
2
Enter length : 
2
AREA OF SQUARE: 4
$ java ovr
INPUT

1.RECTANGLE
2.SQUARE
3.CIRCLE

Enter your Choice:  
3
Enter Radius : 
2
AREA OF CIRCLE: 12.56

*/

