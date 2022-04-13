//SIMPLE BINARY SEARCH

import java.util.*;
class simpbin{
     public static void main(String args[]){
               Scanner s=new Scanner(System.in);
               int i;
               System.out.print("INPUT\n");
               System.out.print("_____\n");
               System.out.print("\n");
               System.out.print("Enter Number of elements: ");
               int n=s.nextInt();
               int arr[]=new int[n];//declaring array
               int k=0;
             System.out.print("Enter the elements in sorted order: ");
             for( i=0;i<n;i++)
             {
              arr[i]=s.nextInt();//reading values
             }
             System.out.print("Enter the element to search: ");
             int a=s.nextInt();
             System.out.print("\n");
             System.out.print("OUTPUT\n");
             System.out.print("______ \n");
             System.out.print("\n");  
           
             int f=0,l=n-1,mid=(f+l)/2;
            while(f<=l)
             {
               if(a>arr[mid])//case of element is right of mid
                {
                 f=mid+1;
                 mid=(f+l)/2;
                }
               else if(a<arr[mid])//case of element is left of mid
               {
                l=mid-1;
                mid=(f+l)/2;
               }
                else//case of match
               {
                System.out.print("Element found at index "+mid);
                k=1;
                break;
               }
             }
             if(k==0)
             {
               System.out.print("Element not found....  ");
              }
    /*
INPUT
_____

Enter Number of elements: 2
Enter the elements in sorted order: 13
13
Enter the element to search: 16

OUTPUT
______ 

Element not found.... 
*/
}
}

