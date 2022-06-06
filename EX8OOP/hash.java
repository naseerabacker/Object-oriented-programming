/*7. Write a Java program to compare two hash set  */



import java.util.*;


class hash
{

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        HashSet<String> set1=new HashSet<String>();  

        System.out.print("Enter the number of elements to be inserted in set1: ");
        int n1=in.nextInt();
        System.out.println("Enter item to add: ");  

        for(int i=0;i<n1;i++)
        {            
            String s1=in.next();
            set1.add(s1);            
        }

        HashSet<String> set2=new HashSet<String>();    
        System.out.print("Enter the number of elements to be inserted in set2: ");
        int n2=in.nextInt();
        System.out.println("Enter item to add: ");  

        for(int i=0;i<n2;i++)
        {            
            String s2=in.next();
            set2.add(s2);            
        }
       
        if (Objects.equals(set1, set2))
        System.out.println("Two hash set are equal");
        else
        System.out.println("Two hash sets are not equal");

    }
}

/*
ksb@ksb-ThinkCentre-Edge72:~/Desktop/EX8OOP$ java hash
Enter the number of elements to be inserted in set1: 2
Enter item to add: 
this   
that
Enter the number of elements to be inserted in set2: 2
Enter item to add: 
this
that
Two hash set are equal
*
Enter the number of elements to be inserted in set1: 3
Enter item to add: 
we
are 
zzz
Enter the number of elements to be inserted in set2: 3
Enter item to add: 
his
pop
this
Two hash sets are not equal
*/
