//define a class 'product' with data members pcode,pname and price.Create 3 objects of the class and find the product having the lowest price

import java.util.*;
class p1
{
int pcode;
String pname;
int price;
     void setdata(int a,int b,String c)//to initialise values
      {
        pcode=a;
        pname=c;
        price=b;
       
      }

public static void main(String args[])
{
            Scanner s=new Scanner(System.in);
            System.out.print("INPUT\n");
            System.out.print("\n");

            int a1,a2,a3;
            int b1,b2,b3;
            String c1,c2,c3;
            p1 obj1=new p1();//declaring  objects
            p1 obj2=new p1();
            p1 obj3=new p1();
      

            System.out.print("Enter person 1 "+" pcode,pname,price: \n ");
            a1=s.nextInt();
            c1=s.next();
            b1=s.nextInt();
            obj1.setdata(a1,b1,c1);//invoking setdata

           
            System.out.print("Enter person 2 "+" pcode,pname,price:\n ");
            a2=s.nextInt();
            c2=s.next();
            b2=s.nextInt();
            obj2.setdata(a2,b2,c2);

          
            System.out.print("Enter person 3 "+" pcode,pname,price:\n ");
            a3=s.nextInt();
            c3=s.next();
            b3=s.nextInt();
            obj3.setdata(a3,b3,c3);
            
           
            System.out.print("\n");
            System.out.print("OUTPUT\n");
            System.out.print("\n");
//comparing and finding smallif(obj1.price<obj2.price && obj1.price<obj3.price)  
           if(obj1.price<obj2.price && obj1.price<obj3.price)  
             System.out.println(" Product code= " +obj1.pcode+" , Product  name="+obj1.pname+" , price="+obj1.price); 

           if(obj2.price<obj1.price && obj2.price<obj3.price)  
             System.out.println(" Product code= " +obj2.pcode+" , Product name="+obj2.pname+" , price="+obj2.price);


           if(obj3.price<obj1.price && obj3.price<obj2.price)  
              System.out.println(" Product code= " +obj3.pcode+" , Product name="
+obj3.pname+" , price="+obj3.price);            
             
}
}
/*
INPUT

Enter person 1  pcode,pname,price: 
 12
MANGO 
12
Enter person 2  pcode,pname,price:
 11
TOMATO
42
Enter person 3  pcode,pname,price:
 13
ONION
56

OUTPUT

 Product code= 12 , Product name=MANGO , price=12
*/


