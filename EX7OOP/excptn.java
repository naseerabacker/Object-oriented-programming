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
ENTER THE NUMBER OF LIMIT:
4
ENTER NUMBERS:
1
5
3
6
AVERAGE OF 4 POSITIVE NUMBER:3.75

$ java excptn
ENTER THE NUMBER OF LIMIT:
5
ENTER NUMBERS:
2
4
6
4
6
AVERAGE OF 5 POSITIVE NUMBER:4.4


*/


