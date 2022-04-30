/*Create a class ‘Employee’ with data members Empid,
Name, Salary, Address and constructors to initialize the
data members. Create another class ‘Teacher’ that inherit
the properties of class employee and contain its own data
members department, Subjects taught and constructors
to initialize these data members and also include display
function to display all the data members. Use array of
objects to display details of N teachers.*/

import java.util.*;
	class Employee
	{
		 int empid;
		 String name;
		 float salary;
		 String address;
		 Employee()
		 {
		 }

		Employee(int emp,String na,float sal,String addr)
		{
			empid=emp;
			name=na;
			salary=sal;
			address=addr;
		}
	}


class Teacher extends Employee
{

	  String department;
	  String subject;

	  Teacher(int emp,String na,float sal,String addr,String dept,String sub)
	  {

		  empid=emp;
		  name=na;
		  salary=sal;
		  address=addr;
		  department=dept;
		  subject=sub;

	  }


	void display()
	{
		  System.out.println("Emp id:"+empid);
		  System.out.println("Employee name:"+name);
		  System.out.println("Salary:"+salary);
		  System.out.println("Address:"+address);
		  System.out.println("Department:"+department);
		  System.out.println("Subject:"+subject);

	}
}

class emp
{
	public static void main(String args[])
	{
	  Scanner in=new Scanner(System.in);
	  System.out.println("Enter no.of teachers:");
	  int n=in.nextInt();
	  Teacher obj[]=new Teacher[n];
	  for(int i=0;i<n;i++)
		      {
			System.out.println("Enter employee id:");
			int emp=in.nextInt();
			System.out.println("Enter employee name:");
			String na=in.next();
			System.out.println("Enter salary:");
			float sal=in.nextFloat();
			System.out.println("Enter address:");
			String addr=in.next();
			System.out.println("Enter department:"); 
			String dept=in.next();
			System.out.println("Enter subject:");
			String sub=in.next();
			obj[i]=new Teacher(emp,na,sal,addr,dept,sub);

	     
	                  }
			System.out.println("\n Details of employee:");
			for(int i=0;i<n;i++)
			{
			 obj[i].display();
			}
	}
}

/*
Enter no.of teachers:
2
Enter employee id:
12
Enter employee name:
MEERA
Enter salary:
2000
Enter address:
KALLNTHDE
Enter department:
MCA
Enter subject:
CN
Enter employee id:
13
Enter employee name:
TEERA
Enter salary:
3000
Enter address:
KATTNGAL
Enter department:
MBA
Enter subject:
MATHS

 Details of employee:
Emp id:12
Employee name:MEERA
Salary:2000.0
Address:KALLNTHDE
Department:MCA
Subject:CN
Emp id:13
Employee name:TEERA
Salary:3000.0
Address:KATTNGAL
Department:MBA
Subject:MATHS
ksb@ksb-ThinkCentre-Edge72:~/Desktop/EX5OOP$ 
*/


