package Graphics;
import java.util.*;

interface tri
{
  public void area(int a,int b);
}
 public class Triangle implements tri
{
 public void area(int a,int b)
{
    System.out.println("AREA OF TRIANGLE : "+  (a*b*0.5)+"\n");
  }

}
