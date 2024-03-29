/*
Find the average of N positive integers, raising a user
defined exception for each negative input
*/
import java.util.*;

class myException extends Exception
{
    public myException(String s)
    {
        super(s);
    }
}

class excptn
{
       public static void main(String ar[])
        {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF LIMIT:");
        int n=in.nextInt();
       
        int a,b=0,total=0;
        System.out.println("ENTER NUMBERS:");
        for(int i=0;i<n;i++)
        {
            a=in.nextInt();
            try
            {
                if(a>=0)
                {
                    b++;
                    total=total+a;
                }
                else
                {
                    throw new myException("NEGATIVE NUMBERS ARE NOT ALLOWED");
                }
            }
            catch(myException ex)
               {
                    System.out.print(ex.getMessage()+"\n");
               }
            if(a<0)
            {
                i--;
            }
        }
           
        System.out.println("AVERAGE OF "+ n + " POSITIVE NUMBER:" + (double)total/b);
    }
}

/*
ksb@ksb-ThinkCentre-Edge72:~/Desktop/naseeras2/java/EX7OOP$ java excptn
ENTER THE NUMBER OF LIMIT:
5
ENTER NUMBERS:
-1
NEGATIVE NUMBERS ARE NOT ALLOWED
^Cksb@ksb-ThinkCentre-Edge72:~/Desktop/naseeras2/java/EX7OOP$ javac excptn.java
ksb@ksb-ThinkCentre-Edge72:~/Desktop/naseeras2/java/EX7OOP$ java excptn
ENTER THE NUMBER OF LIMIT:
2
ENTER NUMBERS:
1
2
AVERAGE OF 2 POSITIVE NUMBER:1.5

*/


