//employee record and search whether person exist
import java.util.*;
class emp
{
int eno,esal;
String ename;
void setdata(int a,String b,int c)// initialise variables
{
eno=a;
ename=b;
esal=c;
}
}
class p3{
     public static void main(String args[])
	{
            Scanner s=new Scanner(System.in);
            System.out.print("INPUT\n");
            System.out.print("\n");
            System.out.print("Enter number of employees: ");
            int n=s.nextInt();
            emp obj[]=new emp[n];//declaring an array of objects
            for(int j=0;j<n;j++)//to allocate memory for each objects
            obj[j]=new emp();
            int a,f=0;
            String b;
            int c,i;
            for(i=0;i<n;i++)
            {
             System.out.println("Enter Employee number,employee name,salary of person  "+(i+1));
             a=s.nextInt();
             b=s.next();
             c=s.nextInt();
             obj[i].setdata(a,b,c);
             
             }

             System.out.println("Enter person id to search: ");
             int id=s.nextInt();

             System.out.print("\n");
             System.out.print("OUTPUT\n");
             System.out.print("\n");            

             for(i=0;i<n;i++)
               {
                 if(id==obj[i].eno)//comparing id's
                  {
                   System.out.println("PERSON EXISTS IN THE LIST... ");
                    f=1;
                    break;
                   }
  	     }	        
                
            if(f==0)
               System.out.println("PERSON NOT FOUND... ");
}
}

/*
INPUT

Enter number of employees: 2
Enter Employee number,employee name,salary of person  1
23
nas 
5645
Enter Employee number,employee name,salary of person  2
12
man
6546
Enter person id to search: 
12

OUTPUT

PERSON EXISTS IN THE LIST... 


*/
