/* TO CHECK WHETHER GIVEN MATRIX IS SYMMETRIC OR NOT */

import java.util.Scanner;
public class Symmetric{
    static void checkSymmetric(int mat[][],int row,int col)

{
        int i,j,flag=1;
        System.out.print("The matrix formed is:\n");
        
        for(i=0;i<row;i++)
        {
        for(j=0;j<col;j++)
        {
         System.out.print(mat[i][j]+"\t");
        }
         System.out.print("\n");
        }
        int[][] transpose=new int [row][col];
          
        for(i=0;i<row;i++)
        {
        for(j=0;j<col;j++)
        {
         transpose[j][i]=mat[i][j];
        }
        }
        if(row==col)
        {
          
        for(i=0;i<row;i++)
        {
        for(j=0;j<col;j++)
        {
        if(transpose[i][j]!=mat[i][j])
        {
         flag=0;
         break;
         }
         }
        if(flag==0)
        {
         System.out.print("\n The matrix is not symmetric");
         break;
         }
         }
       if(flag==1)
         {
          
         System.out.print("\n The matrix is symmetric");
        
         }
          }
          else
          {
         
         System.out.print("\n The matrix is not symmetric");
        
         }
         }

        public static void main(String[] args)

        {
        
        Scanner sc= new Scanner(System.in);
        int i,j,row,col,flag=1;
        
        
        System.out.print("enter the no.of rows: ");
        row=sc.nextInt();
        
        System.out.print("enter the no.of columns: ");
        col=sc.nextInt();

        int[][] mat=new int[row][col];
        System.out.print("enter the matrix elements: ");
        for(i=0;i<row;i++)
        {
        for(j=0;j<col;j++)
        {
         mat[i][j]=sc.nextInt();
        }
         }
         checkSymmetric(mat,row,col);
         }
        } 

/*

----1------
enter the no.of rows: 3
enter the no.of columns: 3
enter the matrix elements: 1
2
3
2
3
4
3
4
5
The matrix formed is:
1	2	3	
2	3	4	
3	4	5	

 The matrix is symmetric
-----2-------
enter the no.of rows: 3
enter the no.of columns: 3
enter the matrix elements: 3
3
3
5
6
3
8
6
4
The matrix formed is:
3	3	3	
5	6	3	
8	6	4	

 The matrix is not symmetric
*/
