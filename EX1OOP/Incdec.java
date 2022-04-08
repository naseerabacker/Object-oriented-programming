import java.util.Scanner;
public class Incdec {
   public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = in.nextDouble();
        System.out.print("Enter second number: ");
        double b= in.nextDouble();
       System.out.print("Enter third number: ");
         
        double c= in.nextDouble();
        

        if (a < b && b < c)
        {
            System.out.println("Increasing ");
        }
        else if (a > b&& b> c)
        {
            System.out.println("Decreasing ");
        }
        else
        {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}

/*                                                                               

Enter first number: 3
Enter second number: 4
Enter third number: 5
Increasing 

Enter first number: 6
Enter second number: 5
Enter third number: 4
Decreasing 

Enter first number: 8
Enter second number: 3
Enter third numer:9
Neither increasing or decreasing order
*/



 


