//recursive binary search


import java.util.*;
class recrusive
{
int bisearch(int f,int l,int x,int arr[])//recursive fun
{
 if(l>=f)
{
 int mid=(f+l)/2;

 if(arr[mid]==x)//case of match
   return mid;

 if(x>arr[mid])
  return bisearch(mid+1,l,x,arr);//case of right side
  return bisearch(f,mid-1,x,arr);//case of left side
}
return -1;
}
public static void main(String args[])
{
            
   System.out.print("INPUT\n");
   System.out.print("_____\n");
   System.out.print("\n");
   recrusive obj=new recrusive();
   Scanner s=new Scanner(System.in);
   int i;
   System.out.print("Enter Number of elements: ");
   int n=s.nextInt();
   int arr[]=new int[n];
               
   System.out.print("Enter the elements in sorted order : ");
    for( i=0;i<n;i++)
       {
        arr[i]=s.nextInt();
        }
   System.out.print("Enter the element to search: ");
   int a=s.nextInt();
               
   System.out.print("\n");
   System.out.print("OUTPUT\n");
   System.out.print("______ \n");
   System.out.print("\n");
   int k=obj.bisearch(0,n-1,a,arr);//invoking bisearch
      if(k==-1)
         System.out.print("Element not found... ");
      else
         System.out.print("Element found at index "+k);
           
}

}

/*

INPUT
_____

Enter Number of elements: 4
Enter the elements in sorted order : 
1
2
45
56
Enter the element to search: 54

OUTPUT
______ 

Element not found... 

INPUT
_____

Enter Number of elements: 3
Enter the elements in sorted order :
12
13
14
Enter the element to search: 14

OUTPUT
______ 

Element found at index 2


*/
