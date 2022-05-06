/* Prepare bill with the given format using calculate method from interface
*/

import java.util.* ;
interface BillGen
{
 int calculate( ) ;
}
class ProductB implements BillGen
{
  String name ;
  int prodid , quantity , unitprice , total ;
  ProductB ( )
  {}
  ProductB( String n , int p , int q , int u)
  {
	name = n ; 
	prodid = p ;
	quantity = q ;
	unitprice = u ;
  }
	public int calculate ( )
          {
	  total = quantity * unitprice ;
	  return total ;
	}
}
public class bill 
{
public static void main ( String [ ] args ) 
{
  ProductB [ ] [ ] order ;
  System.out.println (" Enter no. of orders : " ) ;
  Scanner sc = new Scanner ( System.in ) ;
  int n = sc.nextInt ( ) ;
  order = new ProductB[n][ ] ;
	for ( int i = 0 ; i < n ; i++)
	{
	System.out.print(" Enter no. of Products : " ) ;
	int m = sc.nextInt ( ) ;
	order[i] = new ProductB[m] ;
		for (int j = 0 ; j < m; j++ )
		{
		  System.out.print (" Enter Product " + j + " Name : " ) ;
		  String a = sc.next ( ) ;
		  System.out.print(" Enter Product ID: " ) ;
		  int b = sc.nextInt ( ) ;
		  System.out.print (" Enter Product Quantity : " ) ;
		  int c = sc . nextInt ( ) ;
		  System.out.print (" Enter Product Unit Price : " ) ;
		  int d = sc .nextInt ( ) ;
		  ProductB pb = new ProductB ( a , b , c , d ) ;
		  order [ i ] [ j ] = pb ;
		  order [ i ] [ j ] . total = order [ i ] [ j ] . calculate( ) ;
		}
	}
	for(int i = 0 ; i < n ; i++)
          {
	int sum = 0 ;
	System.out.println("Order No : " + ( i +1) ) ;
	Date date=java.util.Calendar.getInstance() . getTime ( ) ;
	System.out.println( date ) ;
	           			  System.out.println("_________________________________________________________________"); 
	
 System.out.printf ("%5s %20s %25s %10s %10s " ,"ProdId " ,"Name" , "Quantity " , " Unit Price " ," Total " ) ;
	System.out.println ( ) ;
	System.out.println("___________________________________________________________________");
	
	for( int j =0; j<order [ i ] . length ; j++)
	{
	System.out.printf ("%5s %20s %25s %10s%10s " ,order[i][j].prodid ,order [ i ] [ j ] . name ,	order [ i ] [ j ] . quantity ,
				order [ i ] [ j ] . unitprice ,order [ i ] [ j ] . total ) ;
	System.out.println ( ) ;
			
         }
			      System.out.println("____________________________________________________________________");
			


	for ( int k=0; k<order [i] . length ; k++)
	sum = sum + order[i] [k] . total ;
	System.out.println (" Net Amount : " + sum) ;
			      System.out.println("___________________________________________________________________-_____");
}
}
}




/*
Enter no. of orders : 
2
 Enter no. of Products : 2
 Enter Product 0 Name : mango
 Enter Product ID: 22
 Enter Product Quantity : 5
 Enter Product Unit Price : 12
 Enter Product 1 Name : orange
 Enter Product ID: 23
 Enter Product Quantity : 5
 Enter Product Unit Price : 13
 Enter no. of Products : 3
 Enter Product 0 Name : lamp
 Enter Product ID: 45
 Enter Product Quantity : 3
 Enter Product Unit Price : 90
 Enter Product 1 Name : bulb
 Enter Product ID: 46
 Enter Product Quantity : 1
 Enter Product Unit Price : 50
 Enter Product 2 Name : fan
 Enter Product ID: 48
 Enter Product Quantity : 1
 Enter Product Unit Price : 100
Order No : 1
Fri May 06 12:08:21 IST 2022
__________________________________________________________________________________
ProdId                  Name                 Quantity   Unit Price      Total  
___________________________________________________________________________________
   22                mango                         5         12        60 
   23               orange                         5         13        65 
_______________________________________________________________________________
 Net Amount : 125
___________________________________________________________________________________
Order No : 2
Fri May 06 12:08:21 IST 2022
_________________________________________________________________________________
ProdId                  Name                 Quantity   Unit Price      Total  
____________________________________________________________________________________
   45                 lamp                         3         90       270 
   46                 bulb                         1         50        50 
   48                  fan                         1        100       100 
_____________________________________________________________________________________
 Net Amount : 420
_____________________________________________________________________________________
ksb@ksb-ThinkCentre-Edge72:~/Desktop/naseeras2/java/EX6OOP$ 

