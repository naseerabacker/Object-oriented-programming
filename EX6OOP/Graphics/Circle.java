package Graphics;
import java.util.*;
interface cir
{
  public void area(int a);
}


public class Circle implements cir
{
 public void area(int a)
{
    System.out.println("AREA OF CIRCLE : "+  (a*a*3.14)+"\n");
  }

}

