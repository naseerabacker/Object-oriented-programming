//read two matrices from the console and perform matrix addition
import java.util.*;
class Maddi
{
	public static void main(String args[])
	{
	int row,col,i,j;
	Scanner in = new Scanner(System.in);
 
	System.out.println("Enter the number of rows");
	row = in.nextInt();
 
	System.out.println("Enter the number columns");
	col = in.nextInt();
 
	int m1[][] = new int[row][col];
	int m2[][] = new int[row][col];
	int result[][] = new int[row][col];
	 
	System.out.println("Enter the elements of first matrix");
	 
	for ( i= 0 ; i < row ; i++ )
	{ 
	 
	for ( j= 0 ; j < col ;j++ )
	m1[i][j] = in.nextInt();
	 

	}
	System.out.println("Enter the elements of second matrix");
	 
	for ( i= 0 ; i < row ; i++ )
	{
	 
	for ( j= 0 ; j < col ;j++ )
	m2[i][j] = in.nextInt();
	 

	}
	 
	for ( i= 0 ; i < row ; i++ )
	for ( j= 0 ; j < col ;j++ )
	result[i][j] = m1[i][j] + m2[i][j] ; 
	 
	System.out.println("Sum of matrices:");
	 
	for ( i= 0 ; i < row ; i++ )
	{ 
	for ( j= 0 ; j < col ;j++ )
	System.out.print(result[i][j]+" ");
	System.out.println();

	}
	 
	}
}


/*
-----------output--------------------
Enter the number of rows
3
Enter the number columns
3  
Enter the elements of first matrix
3
4
5
5
8
2
9
4
5
Enter the elements of second matrix
9
5
5
33
2
7
8
8
8
Sum of matrices:
12 9 10 
38 10 9 
17 12 13 

*/
