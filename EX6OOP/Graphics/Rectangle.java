package Graphics;
import java.util.*;

interface rec
{
  public void area(int a,int b);
}

public class Rectangle implements rec
{
 public void area(int a,int b)
{
    System.out.println("AREA OF RECTANGLE : "+ (a*b)+"\n");
  }

}

