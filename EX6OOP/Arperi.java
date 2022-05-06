/* Create an interface having prototypes of functions area() and perimeter(). Create two classes Circle and Rectangle which implements the above interface. Create a menu driven program to find area and perimeter of objects.
*/

import java.util.*;
interface Shape         
{
    void input();
    void area();
    void perimeter();
}

class Circle implements Shape  
{
    int r=0;
    double pi=3.14;
    double ar=0;
    double peri=0;
   
    public void input()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter radius: ");
        r=in.nextInt();
    }
   
    public void area()
    {
        ar=pi*r*r;
        System.out.println("Area of circle: " + ar);
    }
   
    public void perimeter()
    {
        peri=2*pi*r;
        System.out.println("Perimeter of circle: " + peri);
    }
}


class Rectangle implements Shape                   
{
    int l=0,b=0;
    double ar=0;
    double peri=0;
   
    public void input()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter length: ");
        l=in.nextInt();
        System.out.print("Enter breadth: ");
        b=in.nextInt();
    }
   
    public void area()
    {
        ar=l*b;
        System.out.println("area of rectangle: "+ar);
    }
   
    public void perimeter()
    {
        peri=2*(l+b);
        System.out.println("perimeter of rectangle: "+ peri);
    }
}


class Arperi
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        Circle obj1 = new Circle();      //object for circle 
        Rectangle obj2 = new Rectangle();//object for rectangle
       
        while(true)
        {
            System.out.println("\n1.Circle\n2.Rectangle\n3.Exit\nEnter your choice\n\n");
             int c=in.nextInt();
            switch(c)
            {
                case 1:obj1.input();
                       obj1.area();
                       obj1.perimeter();
                       break;
                case 2:obj2.input();
                       obj2.area();
                       obj2.perimeter();
                       break;
                case 3:System.exit(0);
                       default:System.out.println("invalid");
            }


/*
1.Circle
2.Rectangle
3.Exit
Enter your choice


1
Enter radius: 2
Area of circle: 12.56
Perimeter of circle: 12.56

1.Circle
2.Rectangle
3.Exit
Enter your choice


2
Enter length: 4
Enter breadth: 4
area of rectangle: 16.0
perimeter of rectangle: 16.0

1.Circle
2.Rectangle
3.Exit
Enter your choice


3
ksb@ksb-ThinkCentre-Edge72:~/Desktop/naseeras2/java/EX6OOP$ 
*/
        }
    }
}
