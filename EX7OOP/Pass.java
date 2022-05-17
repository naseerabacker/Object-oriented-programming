 /*Write a user defined exception class to authenticate
the user name and password */

import java.util.*;
class myException extends Exception
{
public myException(String s)
{
super(s);
}
}

class Pass
{
   public static void main(String ar[])
    {
       String username="naseera";
       String password="12345";
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter Username:");
       String u=sc.next();
       System.out.print("Enter Password:");
       String p=sc.next();
  try
    {
     if((u.equals(username)) && (p.equals(password)))
     {
     System.out.print("Authentication success");
     }
  else
   {
     throw new myException("Authentication Faild");
   }
  }
  catch(myException ex)
   {

    System.out.print(ex.getMessage()+"\n");
   }
  }
}

/*

ksb@ksb-ThinkCentre-Edge72:~/Desktop/naseeras2/java/EX7OOP$ javac Pass.java
ksb@ksb-ThinkCentre-Edge72:~/Desktop/naseeras2/java/EX7OOP$ java Pass
Enter Username:naseera
Enter Password:naseera
Authentication Faild
ksb@ksb-ThinkCentre-Edge72:~/Desktop/naseeras2/java/EX7OOP$ javac Pass.java
ksb@ksb-ThinkCentre-Edge72:~/Desktop/naseeras2/java/EX7OOP$ java Pass
Enter Username:naseera
Enter Password:12345
Authentication successksb@ksb-ThinkCentre-Edge72:~/Desktop/naseeras2/java/EX7OOP

*/
