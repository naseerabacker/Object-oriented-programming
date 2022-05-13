package Graphics;
import java.util.*;
interface sq
{
  public void area(int a,int b);
}



public class Square implements sq
{
 public void area(int a,int b)
{
    System.out.println("AREA OF SQUARE : "+  (a*a)+"\n");
  }

}

